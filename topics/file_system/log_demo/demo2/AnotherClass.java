package topics.file_system.log_demo.demo2;

import java.util.logging.Logger;

public class AnotherClass {
    private static final Logger LOGGER = Logger.getLogger(LogExample.class.getName());

    static void testLogger() {
        LOGGER.info("info-level I am from AnotherClass");
    }
}
