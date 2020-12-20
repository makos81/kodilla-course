package com.kodilla.stream.portfolio;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Board {
    private final List<TaskList> taskLists = new ArrayList<>();
    private final String name;

    public Board(String name) {
        this.name = name;
    }

    public List<TaskList> getTaskLists() {
        return new LinkedList<>(taskLists);
    }

    public String getName() {
        return name;
    }

    public void addTaskList(TaskList taskList) {
        taskLists.add(taskList);
    }

    public boolean removeTaskList(TaskList taskList) {
        return taskLists.remove(taskList);
    }

    @Override
    public String toString() {
        return "Board{" +
                "taskLists=" + taskLists +
                ", name='" + name + '\'' +
                '}';
    }

    public boolean equals(Object o){
        if(o==this)
            return true;
        else if(o==null || !(o instanceof Board))
            return false;
        return this.name.equals(((Board) o).getName());
    }
}
