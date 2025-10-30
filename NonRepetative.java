package com.program;

public class NonRepetative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "swiss";
		
		Character result = str.chars().mapToObj(c -> (char) c )
				.filter(s ->str .indexOf(s) == str.lastIndexOf(s))
				.findFirst().orElse(null);
		
		System.out.println(result);
	}

}
