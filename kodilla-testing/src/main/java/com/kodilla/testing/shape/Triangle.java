package com.kodilla.testing.shape;

public class Triangle implements Shape{
    private String name = "Triangle";
    private int edge;
    private int height;

    public Triangle(int edge, int height){

        this.edge = edge;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare( triangle.edge, edge ) != 0) return false;
        if (Double.compare( triangle.height, height ) != 0) return false;
        return name.equals( triangle.name );

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits( edge );
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits( height );
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String getShapeName() {

        return name;
    }
    @Override
    public double getField() {

        return edge*height* 0.5;
    }
}
