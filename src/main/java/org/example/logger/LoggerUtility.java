package org.example.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerUtility {

    private final Logger logger = LoggerFactory.getLogger(LoggerUtility.class);

    public void logFunction() {

        logger.trace("This is trace");
        logger.debug("This is debug");
        logger.info("This is info");
        logger.debug("This is debug");
        logger.error("This is error");
    }

    public void functionalityOfSlf4j() {

        String name = "sakthivel";
        logger.debug("User : {}", name);
    }
}