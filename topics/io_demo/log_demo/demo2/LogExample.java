package topics.io_demo.log_demo.demo2;

import java.io.IOException;
import java.util.logging.*;

public class LogExample {
    //private static final Logger LOGGER = Logger.getLogger("LogExample");
    private static final Logger LOGGER = Logger.getLogger(LogExample.class.getName());
    //private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void setupLogger() {
        LogManager.getLogManager().reset();
        LOGGER.setLevel(Level.ALL);

        // Console
        ConsoleHandler ch = new ConsoleHandler();
        ch.setLevel(Level.SEVERE);
        LOGGER.addHandler(ch);

        // File
        String fileName = "src\\topics\\io_demo\\log_demo\\demo2\\myLogger.log";
        try {
            FileHandler fh = new FileHandler(fileName, true);
            fh.setFormatter(new SimpleFormatter()); // if we want the log to be prettier
            fh.setLevel(Level.FINE);
            LOGGER.addHandler(fh);
        } catch (IOException e) {
            //e.printStackTrace();
            LOGGER.log(Level.SEVERE, "File logger not working", e);
        }
    }

    public static void main(String[] args) {

        LogExample.setupLogger();

        //LOGGER.log(Level.INFO, "INFO level msg"); // same thing
        LOGGER.info("info-level msg"); // same thing

        LOGGER.fine("fine-level msg");

        LOGGER.severe("severe-level msg"); // This severe msg will also display in the console.

        AnotherClass.testLogger();

        try {
            throw new IOException("Manual throw IOException");
        } catch (IOException e) {
            //e.printStackTrace();
            LOGGER.log(Level.SEVERE, "severe-level Error: ", e);
        }

        // SEVERE
        // WARNING
        // INFO
        // CONFIG
        // FINE
        // FINER
        // FINEST

    }
}


