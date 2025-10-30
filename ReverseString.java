package programs;

public class ReverseString {

	public static void main(String[] args) {
		
		String string = "sachin";
		
		String str = "";
		char ch = 0;
		
		for(int i = 0 ; i<string.length() ; i++) {
			
			ch = string.charAt(i);
			str = ch + str;
		}
		
		 System.out.println("ReverseString : " + str);
	}

}
