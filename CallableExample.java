package com.program;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample implements Callable<Integer> {
	
	private List<Integer> numbers;
	
	public CallableExample(List<Integer> numbers) {
		
		this.numbers = numbers;
	}

	@Override
	public Integer call() throws Exception {
		int sum= 0;
		for(Integer num : numbers) {
			sum += num;
		}
		return sum;
	}

	
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newCachedThreadPool();
		
		List<Integer> list = Arrays.asList(10,20,30,40,50);
		CallableExample  task = new CallableExample(list);
		
		Future<Integer> fu = executorService.submit(task);
		
		System.out.println("calculating sum....");
		int result = fu.get();
		
		System.out.println("sum is :" +result);
		
		

	}
	

}
