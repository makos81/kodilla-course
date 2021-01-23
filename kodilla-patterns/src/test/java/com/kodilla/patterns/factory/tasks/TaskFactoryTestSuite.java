package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShopping(){
        TaskFactory taskFactory = new TaskFactory();
        Task shopping = taskFactory.makeTask("SHOPPING");

        Assertions.assertEquals("shopping", shopping.getTaskName());
        Assertions.assertTrue(shopping.isTaskExecuted());
        Assertions.assertEquals("buying: apple", shopping.executeTask());
    }

    @Test
    public void paintingTask(){
        TaskFactory taskFactory = new TaskFactory();
        Task painting = taskFactory.makeTask("PAINTING");

        Assertions.assertEquals("painting", painting.getTaskName());
        Assertions.assertFalse(painting.isTaskExecuted());
        Assertions.assertEquals("painting wall", painting.executeTask());

    }

    @Test
    public void drivingTask(){
        TaskFactory taskFactory = new TaskFactory();
        Task driving = taskFactory.makeTask("DRIVING");

        Assertions.assertEquals("driving", driving.getTaskName());
        Assertions.assertTrue(driving.isTaskExecuted());
        Assertions.assertEquals("driving home", driving.executeTask());


    }
}
