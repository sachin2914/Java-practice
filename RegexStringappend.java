package programs;

public class RegexStringappend {

	public static void main(String[] args) {
		
		//Input: JavaTest
		//Output: $Java$Test
		 
		String str= "JavaTestSachin";
		
		String output = str.replaceAll("([A-Z])", "\\$$1");

        System.out.println(output);
		
	    
	}

}
