package part8.exceptions.problems.p01;

class MyException extends RuntimeException {}

public class Test {
    static void run() {
        try {
            throw Math.random() > 0.5 ? new MyException() : new RuntimeException();
        } catch (RuntimeException rte) {
            System.out.println("B");
        }
    }

    public static void main(String[] args) {
        try {
            run();
        } catch (MyException me) {
            System.out.println("A");
        }
    }
}
