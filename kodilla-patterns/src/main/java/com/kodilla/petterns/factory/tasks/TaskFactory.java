package com.kodilla.petterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task createTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("DrivingTask", "City", "bike");
            case PAINTING:
                return new PaintingTask("PaintingTask", "blue", "see");
            case SHOPPING:
                return new ShoppingTask("ShoppingTask", "dress", 5);
            default:
                return null;
        }
    }
}
