package com.program;

import java.util.Map;
import java.util.stream.Collectors;

public class VowelFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String str = "Java Programming";
		 
		 Map<Character, Long> freq = str.toLowerCase().chars()
				 .filter(ch -> "aeiou".indexOf(ch) != -1)
				 .mapToObj(c -> (char) c)
                 .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		 
		 freq.forEach((vowel, count) -> 
         System.out.println(vowel + " : " + count)
				);
		 
		 System.out.println(freq);
	}

}
