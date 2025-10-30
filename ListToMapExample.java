package com.program;
import java.util.*;
import java.util.stream.Collectors;

public class ListToMapExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Orange");

        Map<Integer, String> map = list.stream()
                .collect(Collectors.toMap(
                        String::length,
                        str -> str,
                        (oldVal, newVal) -> oldVal + ", " + newVal // merge duplicates
                ));


        System.out.println(map);
    }
}
