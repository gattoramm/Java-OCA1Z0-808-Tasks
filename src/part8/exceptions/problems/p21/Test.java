package part8.exceptions.problems.p21;

public class Test {
    public double test(double d) {
        if (d > 0.5) return 1;
        try {
            if (d < 0.1) throw new Exception("Too small!");
        }
        catch (Exception e) { return 666; }
        finally { return 42; }
    }

    public static void main(String[] args) {
        System.out.println(new Test().test(Math.random()));
    }
}
