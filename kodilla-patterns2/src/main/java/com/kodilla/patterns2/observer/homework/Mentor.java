package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{
    private String name;
    private int count;

    public Mentor(String name){
        this.name = name;
    }

    @Override
    public void update(ExcerciseQueue excerciseQueue) {
        count = excerciseQueue.getExcercises().size();
        System.out.println("new excercies " + excerciseQueue.getExcercises().peek() + " from topic: " + excerciseQueue.getName());
    }

    public int getCount(){
        return count;
    }
}
