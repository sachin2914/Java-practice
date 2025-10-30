package programs;

public class SampleProgram {

    private int state = 0; // 0 = A, 1 = B, 2 = C
    private final int TOTAL = 5; // Number of times ABC sequence should be printed

    public synchronized void printA() {
        for (int i = 0; i < TOTAL; i++) {
            while (state != 0) { // Wait until it's A's turn
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.print("A");
            state = 1; // Next turn for B
            notifyAll();
        }
    }

    public synchronized void printB() {
        for (int i = 0; i < TOTAL; i++) {
            while (state != 1) { // Wait until it's B's turn
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.print("B");
            state = 2; // Next turn for C
            notifyAll();
        }
    }

    public synchronized void printC() {
        for (int i = 0; i < TOTAL; i++) {
            while (state != 2) { // Wait until it's C's turn
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.print("C");
            state = 0; // Next turn for A
            notifyAll();
        }
    }

    public static void main(String[] args) {
        SampleProgram obj = new SampleProgram();

        Thread t1 = new Thread(obj::printA);
        Thread t2 = new Thread(obj::printB);
        Thread t3 = new Thread(obj::printC);

        t1.start();
        t2.start();
        t3.start();
    }
}
