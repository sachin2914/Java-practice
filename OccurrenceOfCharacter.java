package programs;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfCharacter {

	public static void main(String[] args) {
	
		String input = "aabbbccddde";
		
		HashMap<Character , Integer > hmap = new HashMap<>();
		
		for(char ch :input.toCharArray()) {
			
			if(hmap.containsKey(ch)) {
				
				hmap.put(ch, hmap.get(ch) + 1);
			} else {
				hmap.put(ch, 1);
			}
		}
		
      for(Map.Entry<Character, Integer> entry:hmap.entrySet()) {
    	  System.out.println(entry.getKey() + ":" + entry.getValue());
      }
	}

}
