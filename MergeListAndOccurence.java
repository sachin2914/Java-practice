package com.program;

import java.util.*;
import java.util.stream.*;

public class MergeListAndOccurence {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Ritesh", "Sachin", "Ritesh");
        List<String> list2 = Arrays.asList("Ankit", "Sachin", "Ritesh");

        // Merge and count occurrences
        Map<String, Long> result = Stream.concat(list1.stream(), list2.stream())
            .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        // Print the result
        System.out.println(result);
       result.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
