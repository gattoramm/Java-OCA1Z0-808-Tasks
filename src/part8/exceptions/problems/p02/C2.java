package part8.exceptions.problems.p02;

import java.io.IOException;

public class C2 {
    public static void main(String[] args){
        try {
            doStuff();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    static void doStuff() throws IOException{
        if (Math.random() > 0.5) throw new IOException();
        throw new RuntimeException();
    }
}
