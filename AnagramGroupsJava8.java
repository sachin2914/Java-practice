package com.program;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


	public class AnagramGroupsJava8 {
	    public static void main(String[] args) {
	        String[] arr = { "abcd", "java", "dcba", "ajav", "xyz", "epam", "pame", "aepm" };

	        // Group by sorted characters using Java 8 Stream API
	        Map<String, List<String>> grouped = Arrays.stream(arr)
	            .collect(Collectors.groupingBy(word -> {
	                char[] chars = word.toCharArray();
	                Arrays.sort(chars);
	                return new String(chars);
	            }));
	        
	        //grouped.values().forEach(System.out::println);
	        
			/*
			 * [java, ajav] [xyz] [epam, pame, aepm] [abcd, dcba]
			 */


	        // Print only the groups that have more than one element
			
			  grouped.values().stream() .filter(group -> group.size() > 1) .forEach(group
			 -> System.out.println(group + " contains same character"));
			 
	    }
	}



