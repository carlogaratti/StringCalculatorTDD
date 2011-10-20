package my.stringcalculator;

public class Splitter {
	
	private String delimiter = ",";
	private String replaced;
	private String[] tokens;
	
	public Splitter(String[] tokens) {
		 this.tokens = tokens;
	}

	public String[] split(String stringOfIntegers) { 
		 replaced = stringOfIntegers;
		 for (int i = 0; i < tokens.length; i++) {
			replaced = replaced.replaceAll(tokens[i], delimiter);
		 }
		 return replaced.split(delimiter);
	}

}
