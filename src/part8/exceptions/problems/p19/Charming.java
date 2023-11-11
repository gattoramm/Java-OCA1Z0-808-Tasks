package part8.exceptions.problems.p19;

import java.io.IOException;

interface Prince {
    default void marryHeroine(String girl) throws java.io.IOException {
        System.out.println("Lemme think...");
    }
}

public class Charming implements Prince {
    static String prospectiveMate = "Green Fiona";
    public void marryHeroine(String girl) {
        System.out.println("Marry her?! You gotta be kidding me!");
    }

    public static void main(String[] args) throws IOException {
        Prince prince = new Charming();
        prince.marryHeroine(prospectiveMate = null);
    }
}
