package com.program;

import java.util.Map;
import java.util.stream.Collectors;

public class OccurencOfCharacterStream {

	public static void main(String[] args) {
		String str= "aabbccddee";
		
		
		Map<Character, Long> charCount = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(w->w , Collectors.counting()));
		
		System.out.println(charCount);

	}

}
