package com.kodilla.testing.shape;

public class Square implements Shape {
    private String name = "Square";
    private double edge;

    public Square(double edge) {
        this.edge = edge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;

        Square square = (Square) o;

        if (edge != square.edge) return false;
        return name.equals( square.name );

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = (int) (31 * result + edge);
        return result;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return Math.pow(edge, 2);
    }
}