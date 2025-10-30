package com.program;


public class OddEvenThreadsJava8 {

    private int number = 1;
    private final int max;

    public OddEvenThreadsJava8(int max) {
        this.max = max;
    }

    public void printOdd() {
        synchronized (this) {
            while (number <= max) {
                if (number % 2 == 1) {
                    System.out.println("Thread-1 (Odd): " + number);
                    number++;
                    notify(); // Wake up even thread
                } else {
                    try {
                        wait(); // Wait for your turn
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            notify(); // Wake the even thread if it's waiting
        }
    }

    public void printEven() {
        synchronized (this) {
            while (number <= max) {
                if (number % 2 == 0) {
                    System.out.println("Thread-2 (Even): " + number);
                    number++;
                    notify(); // Wake up odd thread
                } else {
                    try {
                        wait(); // Wait for your turn
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            notify(); // Wake the odd thread if it's waiting
        }
    }

    public static void main(String[] args) {
        int input = 10; // Or any value >= 10

        OddEvenThreadsJava8 printer = new OddEvenThreadsJava8(input);

        // Using Java 8 lambda expressions for threads
        Thread t1 = new Thread(() -> printer.printOdd());
        Thread t2 = new Thread(() -> printer.printEven());

        t1.start();
        t2.start();
    }
}

