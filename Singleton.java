package com.program;

public class Singleton{
	
	private static Singleton instance;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		
		if(instance == null) {
			synchronized(Singleton.class){
				if(instance ==null) {
					instance = new Singleton();
				}
			}
		}
		
		return instance;
		
	}
}
	
 class Main{
	public static void main(String[] args) {
	Singleton singleton1 = Singleton.getInstance();
	System.out.println(singleton1);
		
		
	}
		
		

	}

