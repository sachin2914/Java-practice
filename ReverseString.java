package com.program;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "sachin gurav";
		String str = "";
		char ch = 0 ;
		
		for(int i=0; i < s.length(); i++) {
			
			 ch = s.charAt(i);
			
			 str = ch+ str;
		
		}
		 System.out.println("ReverseString : " + str);
	}
    
	 
}
