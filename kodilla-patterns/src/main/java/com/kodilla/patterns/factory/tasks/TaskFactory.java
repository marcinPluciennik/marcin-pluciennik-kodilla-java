package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Buy clothes", "T-shirt", 1);
            case PAINTING:
                return new PaintingTask("Paint nature", "Blue", "Landscape");
            case DRIVING:
                return new DrivingTask("Drive", "Warsaw", "Car");
            default:
                return null;
        }
    }
}
