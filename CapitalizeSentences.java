package programs;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CapitalizeSentences  {
	public static void main(String[] args) {

		String str = "zensor is software company. company is listed on nse. java is platform independent. i am programmer";

		
		String result = Arrays.stream(str.split("\\.")).map(String::trim).filter(s -> !s.isEmpty())
				.map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1)).collect(Collectors.joining(". ", "", "."));
	
	 System.out.println(result);
	}

}
