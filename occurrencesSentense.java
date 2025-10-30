package com.program;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class occurrencesSentense {

	public static void main(String[] args) {
		
		String str = "My name is sachin";
		
		Map<Object, Long> countString= Arrays.stream(str.split(" "))

				.collect(Collectors.groupingBy(w ->w, Collectors.counting()));
		
		System.out.println(countString);
		
		

	}
	
	
	

}
