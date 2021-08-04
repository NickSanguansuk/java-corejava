package topics.exceptions_demo.throws_handling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        CheckEligibility chk = new CheckEligibility();

        try {
            chk.checkFile();
        } catch (FileNotFoundException e) {
            System.out.println("-catch block-");
            System.out.println(e);
        } finally {
            System.out.println("-finally block-");
        }

        System.out.println("----------");

        chk.checkFile2();

        System.out.println("End of this main()");
    }
}
