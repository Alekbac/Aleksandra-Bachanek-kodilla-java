package shape;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    @Before
    public void beforeEveryTest() {
        System.out.println( "Test case begin." );
    }

    @After
    public void beforeEveryTest() {
        System.out.println( "Test case end." );
    }

    @Test
    public void addFigure(Shape shape){
        ArrayList<Shape> figure = new ArrayList<>();
        figure.add(new Shape("square", "a^2");
        figure.add(new Shape("triangle", "a*h/2");

        System.out.println("Initial list: " + figure.size()));

        figure.add(new Shape("circle", "3.14*R^2");

        System.out.println("After adding element: " + figure.size());
    }
    @Test
    public void removeFigure(Shape shape){
        ArrayList<Shape> figure = new ArrayList<>();

        figure.add(new Shape("square", "a^2");
        figure.add(new Shape("triangle", "a*h/2");
        figure.add(new Shape("circle", "3.14*R^2");

        System.out.println("Removing last object from collection.");
        figure.remove(figure.size()-1);

        for(Shape object: figure) {
            System.out.println("List after removing: " + figure);
        }
    }
    @Test
    public void getFigure(int n){
        ArrayList<Shape> figure = new ArrayList<>();

        figure.add(new Shape("square", "a^2");
        figure.add(new Shape("triangle", "a*h/2");
        figure.add(new Shape("circle", "3.14*R^2");

        for(int n=0; n < figure.size(); n++) {
            System.out.println("Element " + n + " of the list is: " + figure.get(n));
        }
    }
    @Test
    public void showFigures(){
        ArrayList<Shape> figure = new ArrayList<>();

        figure.add(new Shape("square", "a^2");
        figure.add(new Shape("triangle", "a*h/2");
        figure.add(new Shape("circle", "3.14*R^2");

        for(Shape object: figure) {
            System.out.println("Field of figure " + figure.getShapeName() +" is equal: " + figure.getField());
        }
    }

}