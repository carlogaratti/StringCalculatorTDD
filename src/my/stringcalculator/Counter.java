package my.stringcalculator;

public class Counter {

	public int total = 0;
	private Splitter splitter;
	String stringOfIntegers;
	
	public Counter(Splitter splitter, String stringOfIntegers) {
		this.splitter = splitter;
		this.stringOfIntegers = stringOfIntegers;
		manipulate();
		
		
	}
	
	private void manipulate() {
		int delimitator = 0;
		if (stringOfIntegers.startsWith("//")){
		      delimitator = stringOfIntegers.indexOf("\n");
		      this.stringOfIntegers = stringOfIntegers.substring(delimitator+1);
		      this.splitter = new Splitter(new String[]{";"});
		}
		      
	}

	public void add() {
		if(!"".equals(stringOfIntegers)){
			String[] string = splitter.split(stringOfIntegers);
			for (int i = 0; i < string.length; i++) {
				this.total += new Integer(string[i]);
			}		
	    }
		
	}
}


