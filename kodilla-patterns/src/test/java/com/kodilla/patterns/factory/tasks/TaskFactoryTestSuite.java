package com.kodilla.patterns.factory.tasks;

import com.kodilla.petterns.factory.tasks.Task;
import com.kodilla.petterns.factory.tasks.TaskFactory;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testDrivingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.createTask( TaskFactory.DRIVING );
        driving.executeTask();
        //Then
        Assert.assertEquals( "DrivingTask", driving.getTaskNAme() );
        Assert.assertEquals(true, driving.isTaskExecute());
    }

    @Test
    public void testPaintingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.createTask( TaskFactory.PAINTING );
        painting.executeTask();
        //Then
        Assert.assertEquals( "PaintingTask", painting.getTaskNAme() );
        Assert.assertEquals(false, painting.isTaskExecute());
    }
    @Test
    public void testShoppingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.createTask( TaskFactory.SHOPPING );
        shopping.executeTask();
        //Then
        Assert.assertEquals( "ShoppingTask", shopping.getTaskNAme() );
        Assert.assertEquals(false, shopping.isTaskExecute());
    }
}
