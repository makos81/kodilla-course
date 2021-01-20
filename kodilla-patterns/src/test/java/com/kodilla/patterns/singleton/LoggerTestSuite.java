package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class LoggerTestSuite {
    private static Logger logger;

    @BeforeAll
    public static void createLogger(){
        logger = Logger.INSTANCE;
    }

    @Test
    public void testGetLog(){
        logger.log("moj log testowy");
        Assertions.assertEquals("moj log testowy", logger.getLastLog());
    }
}
