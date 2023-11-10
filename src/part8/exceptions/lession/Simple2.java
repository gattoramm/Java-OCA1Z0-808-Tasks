package part8.exceptions.lession;

import java.io.IOException;
import java.sql.SQLException;

public class Simple2 {
    static void run() throws SQLException, IOException {
        System.out.println("In run()");
        throw new SQLException();
    }
    public static void main(String[] args) {
        try {
            run();
        } catch (SQLException e) {
            System.out.println(e);
        }  catch (IOException e) {
            System.out.println(e);
        } finally {
            System.out.println("In finnaly");
        }
        System.out.println("After catch");
    }
}
