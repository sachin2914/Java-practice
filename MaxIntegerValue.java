package programs;

import java.util.Arrays;
import java.util.List;

public class MaxIntegerValue {

	public static void main(String[] args) {
		
		List<Integer> list =  Arrays.asList(1,1,2,3,4,5,6);
		
		int max = list.stream()
				.max(Integer::compare)
				.orElse(0);
		
		System.out.println(max);
	}

}
