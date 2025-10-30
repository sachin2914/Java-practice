package programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sample {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4};

        List<Integer> oddNumbers = Arrays.stream(arr1)
                .filter(num -> num % 2 != 0)  // 
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Odd Numbers: " + oddNumbers);
	}
		
	}

