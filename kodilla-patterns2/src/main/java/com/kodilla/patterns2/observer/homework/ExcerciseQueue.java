package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class ExcerciseQueue implements Observable{
    private Queue<String> excercises;
    private String queueName;
    private List<Observer> observerList;

    public ExcerciseQueue(String name){
        excercises = new ArrayDeque<>();
        queueName = name;
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observerList){
            observer.update(this);
        }
    }

    public Queue<String> getExcercises(){
        return excercises;
    }

    public String getName(){
        return queueName;
    }

    public void addExcercise(String excercise){
        this.excercises.add(excercise);
        notifyObservers();
    }

}
