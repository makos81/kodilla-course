package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{
    private String taskName;
    private String whatToBuy;
    private double quantity;
    private boolean taskExecuted;

    public ShoppingTask(String taskName, String whatToBuy, double quantity){
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        this.taskExecuted = false;
    }

    @Override
    public String executeTask(){
        this.taskExecuted = true;
        return "buying: " + whatToBuy;
    }

    @Override
    public String getTaskName(){
        return taskName;
    }

    @Override
    public boolean isTaskExecuted(){
        return this.taskExecuted;
    }
}
