package shape;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.*;

public class ShapeCollectorTestSuite {

    @Before
    public void beforeEveryTest() {
        System.out.println( "Test case: begin." );
    }

    @After
    public void afterEveryTest() {
        System.out.println( "Test case: end." );
    }

    @Test
    public void testAddFigure(Shape shape){
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle(10);

        shapeCollector.add(shape);

        assertEquals(1; list.size());
    }
    @Test
    public void testRemoveFigure(Shape shape){
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle(10);

        shapeCollector.remove(shape);

        assertEquals(0, list.size());
    }
    @Test
    public void testGetFigure(int n){
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle(10);

        shapeCollector.add(shape);
        System.out.println("One figure from the list: " + shapeCollector.getFigure(0));

        assertEquals(0, shapeCollector.getFigure(0));
    }
    @Test
    public void testShowFigures(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle(10);

        shapeCollector.add(shape);

        ArrayList<Shape> list = new ArrayList<>();
        list.add(shape);

        ArrayList<Shape> finalList = shapeCollector.getObjects();

        assertEquals(list.toString(); finalList.toString());
    }
}

