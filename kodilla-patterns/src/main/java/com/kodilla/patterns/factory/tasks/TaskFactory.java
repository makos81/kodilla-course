package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    private final String TASK_DRIVING = "DRIVING";
    private final String TASK_PAINTING = "PAINTING";
    private final String TASK_SHOPPING = "SHOPPING";

    public final Task makeTask(final String task){
        switch (task){
            case TASK_SHOPPING:
                return new ShoppingTask("shopping", "apple", 12);
            case TASK_PAINTING:
                return new PaintingTask("painting", "red", "wall");
            case TASK_DRIVING:
                return new DrivingTask("driving", "home", "car");
            default:
                return null;
        }
    }
}
