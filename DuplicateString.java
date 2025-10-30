package programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateString {

	public static void main(String[] args) {
		
		
		 List<String> list = Arrays.asList("abc", "pqr", "xyz", "abc", "pqr");

	        Set<String> seen = new HashSet<>();
	        Set<String> duplicates = list.stream()
	                .filter(e -> !seen.add(e)) // add() returns false if element already exists
	                .collect(Collectors.toSet());

	        System.out.println("Duplicates: " + duplicates);
	    
	
	List<String> uniqueList = list.stream()
            .distinct()
            .collect(Collectors.toList());

    System.out.println("Original List: " + list);
    System.out.println("List after removing duplicates: " + uniqueList);
    
	}

}
