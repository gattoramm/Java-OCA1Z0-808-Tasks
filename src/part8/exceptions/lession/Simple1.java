package part8.exceptions.lession;

public class Simple1 {
    static void run() {
        throw new NullPointerException();
    }
    public static void main(String[] args) {
        try {
            run();
        } catch (NullPointerException e) {
            System.out.println(e);
            throw new RuntimeException();
        } finally {
            System.out.println("In finnaly");
        }
        System.out.println("After catch");
    }
}
