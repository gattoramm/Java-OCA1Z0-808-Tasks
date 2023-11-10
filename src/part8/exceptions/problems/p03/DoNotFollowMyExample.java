package part8.exceptions.problems.p03;

import java.util.ArrayList;
import java.util.List;

public class DoNotFollowMyExample {
    public static void main(String[] args) {
        List list = new ArrayList();
        try {
            for (;;) list.add("New item");
        } catch (RuntimeException rte) {
            System.out.println("Caught an RTE");
        } catch (OutOfMemoryError oome) {
            System.out.println("Out of memory...");
        }
        System.out.println("Total success!");
    }
}
