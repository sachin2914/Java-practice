package com.program;

public class nonRepetativecharatcer {

	public static void main(String[] args) {
	

		String str = "swiss";
		Character nonRepetative = str.chars()
				.mapToObj(c -> (char) c)
				.filter(ch -> str.indexOf(ch) ==  str.lastIndexOf(ch))
				.findFirst()
				.orElse(null);
				
				//.orElseThrow(() -> new RuntimeException("nonRepetative"));
		
		System.out.println(nonRepetative);
		
	}

}
