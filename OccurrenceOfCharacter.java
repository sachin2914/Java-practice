package com.program;
import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfCharacter {
    public static void main(String[] args) {
        String input = "programming";
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : input.toCharArray()) {
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                charCountMap.put(ch, 1);
            }
        }

        // Print the character counts
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
