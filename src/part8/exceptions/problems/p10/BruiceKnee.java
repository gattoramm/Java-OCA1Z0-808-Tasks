package part8.exceptions.problems.p10;

public class BruiceKnee {
    private static void run() { tripOverCat(); }
    private static void tripOverCat() {
        try {
            throw new Exception();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        run();
    }
}
