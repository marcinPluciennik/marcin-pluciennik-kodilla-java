package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    List<String> tasks;

    public TaskList(){
        tasks = new ArrayList<>();
    }

    public String getTask() {
        String task = tasks.get(0);
        return task;
    }

    public void addTaskToList(String task){
        tasks.add(task);
    }
}
