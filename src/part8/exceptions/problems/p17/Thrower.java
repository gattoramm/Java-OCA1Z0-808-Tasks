package part8.exceptions.problems.p17;

public class Thrower {
    public static void main(String[] args) {
        try {
            doStuff();
            System.out.print("A");
        } catch (RuntimeException rte) {
            System.out.print("B");
        } finally {
            System.out.print("C");
        }
    }

    public static void doStuff() {
        if (Math.random() > 0.5) throw new RuntimeException();
        doMoreStuff();
        System.out.print("D");
    }

    public static void doMoreStuff() {
        System.out.print("E");
    }
}
