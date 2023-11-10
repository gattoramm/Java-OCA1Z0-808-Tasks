package part8.exceptions.lession;

import java.io.*;

class Alpha {
    void run() throws IOException {
        System.out.println("in run() in Alpha");
        throw new IOException();
    }
}

class Beta extends Alpha {
    void run() throws FileNotFoundException {
        System.out.println("in run() in Beta");
    }
}

public class Override {
    public static void main(String[] args) {

    }
}
