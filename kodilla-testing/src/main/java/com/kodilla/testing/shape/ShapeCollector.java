package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapeCollector = new ArrayList<>();

    public ArrayList<Shape> getShapeCollector(){

        return shapeCollector;
    }

    public String showFigures(){
        String figureBody = " ";

       for(Shape figure: shapeCollector ){
           figureBody += "Shape: " + figure.getShapeName() + " , field: " + figure.getField()+"; ";
       }
       return figureBody;
    }

    public void addFigure(Shape shape){

        shapeCollector.add(shape);
    }

    public void removeFigure(Shape shape){
        shapeCollector.remove(shape);
    }

    public Shape getFigure(int n){
        if ( n >= 0 && n < shapeCollector.size()){
            return shapeCollector.get(n);
        }else{
            return null;
        }
    }
}
