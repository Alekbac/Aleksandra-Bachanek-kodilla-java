package shape;

import com.kodilla.testing.shape.*;
import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;
    @Before
    public void before() {
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
        assertEquals(1, shapeCollector.showFigures().size());
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
        assertEquals(0, shapeCollector.showFigures().size());
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
    public void testShowFigures(){
        ArrayList<Shape> shape = new ArrayList<>();

        shape.add( new Circle(10) );
        shape.add(new Triangle(10, 12));
        shape.add (new Square(10));

        for(Shape figure: shape){
            System.out.println("Figures from the list: " + figure.getShapeName() +" "+ figure.getField());
        }
    }
}
