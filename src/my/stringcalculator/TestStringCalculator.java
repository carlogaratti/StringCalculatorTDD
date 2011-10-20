package my.stringcalculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestStringCalculator{
	
	private Counter counter;
	private Splitter splitter;
	String[] tokens;
	@Before
	public void init(){
		tokens = new String[]{"\n", ";"};
		splitter = new Splitter(tokens);
		
	}
	
	@Test
	public void addNothing(){
		counter = new Counter(splitter, "");
		counter.add();
		assertEquals(0, counter.total);
	}
	
	@Test
	public void addOne(){
		counter = new Counter(splitter, "1");
		counter.add();
		assertEquals(1, counter.total);
	}
	
	@Test
	public void addTwo(){
		counter = new Counter(splitter, "1,2");
		counter.add();
		assertEquals(3, counter.total);
	}
	
	@Test
	public void addThree(){
		counter = new Counter(splitter, "1,2,1");
		counter.add();
		assertEquals(4, counter.total);
	}
	
	@Test
	public void addThreeMultipleDelimitator(){
		counter = new Counter(splitter, "1\n2,3");
		counter.add();
		assertEquals(6, counter.total);
	}
	
	@Test
	public void addThreeMultipleDifferentDelimitator(){
		counter = new Counter(splitter, "1\n1,1;1");
		counter.add();
		assertEquals(4, counter.total);
	}
	
	@Test
	public void inlinetokens(){
		counter = new Counter(splitter, "//;\n1;2");
		counter.add();
		assertEquals(3, counter.total);
	}
	
	@Test
	public void inlinetokens1(){
		counter = new Counter(splitter, "//;:\n1;2:1");
		counter.add();
		assertEquals(4, counter.total);
	}
	
	
	
	
}
