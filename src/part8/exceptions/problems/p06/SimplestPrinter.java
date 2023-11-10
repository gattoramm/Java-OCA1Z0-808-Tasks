package part8.exceptions.problems.p06;

import java.io.IOException;

class PrintDaemon {
    private boolean checkContents(String file){
        boolean wrongFile = true;
        return  wrongFile;
    }
    public void printFile(String file) throws IOException {
        if (checkContents(file)) throw new IOException();
        else {}
    }
}

public class SimplestPrinter {
    public static void main(String[] args) throws Exception{
        PrintDaemon pd = new PrintDaemon();
        pd.printFile(args[0]);
    }
}
