package topics.file_system.log_demo.demo1;

import java.io.IOException;
import java.util.logging.Level;

public class Main {

    public static void main(String[] args) {

        String fileName = "src\\topics\\file_system\\log_demo\\demo1\\log.txt";

        try {
            Log myLog = new Log(fileName);

            myLog.logger.setLevel(Level.WARNING);

            myLog.logger.info("Info msg");
            myLog.logger.warning("Warning msg");
            myLog.logger.severe("Severe msg");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
