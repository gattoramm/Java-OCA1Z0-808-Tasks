package part8.exceptions.problems.p04;

public class Test {
    public static void main(String[] args) throws Exception{
        doStuff();
        System.out.println("Done!");
    }

    private static void doStuff() throws Exception {
        System.out.println("Starting...");
        if (Math.random() > 0.5) throw new Exception();
        System.out.println("Finishing...");
    }
}
