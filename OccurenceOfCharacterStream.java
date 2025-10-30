package programs;

import java.util.Map;
import java.util.stream.Collectors;

public class OccurenceOfCharacterStream {

	public static void main(String[] args) {
	
		String input = "aabbbccddde";

        Map<Character, Long> charCountMap = input.chars() // IntStream of chars
                .mapToObj(c -> (char) c) // convert int to Character
                .collect(Collectors.groupingBy(
                       w -> w, // key = character
                        Collectors.counting() // value = count
                ));

        System.out.println("Character Frequency: " + charCountMap);

	}

}
