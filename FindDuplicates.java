package com.program;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "orange", "apple", "banana", "grape");

        Set<String> duplicates = items.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet().stream()
            .filter(entry -> entry.getValue() > 1)
            .map(Map.Entry::getKey)
            .collect(Collectors.toSet());

        System.out.println("Duplicates: " + duplicates);
        
        // second way
        items.stream().filter(i -> Collections.frequency(items, i) >1) ///
        .collect(Collectors.toSet()).forEach(System.out::println);
        
        
        //3rd way
        //Integer[] numbers = new Integer[] { 1, 2, 1, 3, 4, 4 };
        List<Integer> items1 = Arrays.asList(1,2,3,4,5,6,5,6);
        Set<Integer> allItems = new HashSet<>();
        Set<Integer> duplicates1 = items1.stream()
                .filter(n -> !allItems.add(n)) //Set.add() returns false if the item was already in the set.
                .collect(Collectors.toSet());
        System.out.println(duplicates1); // [1, 4]
    }
}
