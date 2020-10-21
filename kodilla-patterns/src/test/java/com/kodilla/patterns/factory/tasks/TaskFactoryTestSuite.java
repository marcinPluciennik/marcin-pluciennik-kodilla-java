package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING);
        System.out.print("SHOPPING: ");
        shoppingTask.executeTask();
        boolean result = shoppingTask.isTaskExecuted();

        //Than
        Assert.assertEquals("Buy clothes", shoppingTask.getTaskName());
        Assert.assertEquals(true, result);
    }

    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING);
        System.out.println("PAINTING: Sorry , I had no time to paint :(");
        boolean result = paintingTask.isTaskExecuted();

        //Than
        Assert.assertEquals("Paint nature", paintingTask.getTaskName());
        Assert.assertEquals(false, result);
    }

    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task drivenTask = taskFactory.makeTask(TaskFactory.DRIVING);
        System.out.print("DRIVING: ");
        drivenTask.executeTask();
        boolean result = drivenTask.isTaskExecuted();

        //Than
        Assert.assertEquals("Drive", drivenTask.getTaskName());
        Assert.assertEquals(true, result);

    }
}
