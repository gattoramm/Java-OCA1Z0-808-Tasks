package part8.exceptions.problems.p22;

import java.io.IOException;

public class StayAlert {
    public static void main(String[] args) {
        IOException ioe = null;
        try {
            throw null;
        } catch (NullPointerException npe) {
            System.out.println("NPE");
        }
        try {
            throw ioe;
        } catch (IOException e) {
            System.out.println(" + IOE");
        }
    }
}
