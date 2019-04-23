package com.kodilla.testing.shape;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;
    @Before
    public void before() {
        ShapeCollector shapeCollector = new ShapeCollector();
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @After
    public void after() {
        System.out.println("Test finished.");
    }

    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle(10);
        //When
        shapeCollector.addFigure(shape);
        //Then
        assertEquals(1, shapeCollector.getShapeCollector().size());
    }
    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle(10);

        shapeCollector.addFigure(shape);
        //When
        shapeCollector.removeFigure(shape);
        //Then
        assertEquals(0, shapeCollector.getShapeCollector().size());
    }
    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle(10);

        shapeCollector.addFigure(shape);
        //When
        Shape result = shapeCollector.getFigure( 0 );
        //Then
        assertEquals(shape, result);
    }
   @Test
    public void testShowFigures() {
        //Given
       ShapeCollector shapeCollector = new ShapeCollector();
       shapeCollector.addFigure( new Circle( 5 ) );
       shapeCollector.addFigure( new Triangle( 10, 3 ) );
       shapeCollector.addFigure( new Square( 6 ) );

       String expextedString = " Shape: Circle , field: 78.53981633974483; " +
                                "Shape: Triangle , field: 15.0; " +
                                 "Shape: Square , field: 36.0; ";
       //When
       String actualString = shapeCollector.showFigures();
       //Then
       Assert.assertEquals(expextedString, actualString);
   }
}
