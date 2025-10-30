package com.program;

import java.util.Arrays;

public class SampleProgram {

	public static void main(String[] args) {

		int[] array = { 1, 2, 4, 5, 6 };
		
		
		int sum = Arrays.stream(array) 
				.reduce(0, (a , b) -> a + b); 

		System.out.println(sum);

	}

}
