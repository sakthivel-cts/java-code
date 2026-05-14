package org.example.anotherlogger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleLogger {

    private final Logger logger = LoggerFactory.getLogger(ExampleLogger.class);

    public void exampleLogger() {

        System.out.println("Methods from Example Logger");

        logger.trace("This is trace");
        logger.debug("This is debug");
        logger.info("This is info");
        logger.debug("This is debug");
        logger.error("This is error");
    }
}