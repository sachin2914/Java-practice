package com.program;

import java.util.concurrent.*;
import java.util.*;

public class CallableDemo implements Callable<Integer> {
    private List<Integer> numbers;

    public CallableDemo(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        CallableDemo task = new CallableDemo(list);

        Future<Integer> future = executor.submit(task);

        System.out.println("Calculating sum...");
        int result = future.get(); // blocks until done

        System.out.println("Sum is: " + result); // Output: Sum is: 150

        executor.shutdown();
    }
}
