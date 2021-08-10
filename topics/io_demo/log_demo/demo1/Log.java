package topics.io_demo.log_demo.demo1;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Log {
    public Logger logger;
    FileHandler fh;

    public Log(String fileName) throws IOException {

        File f = new File(fileName);

        if (!f.exists()) {
            System.out.println("Creating file: " + fileName);
            System.out.println(f.createNewFile());
        }

        fh = new FileHandler(fileName, true);
        logger = Logger.getLogger("test");
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);

    }

}
