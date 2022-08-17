package com.example.demo;
import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private String name;
    private List<Task> TaskList;

    public TaskList(String name){
        this.setName(name);
        this.TaskList = new ArrayList<Task>();
    }

    public void addTask(Task task){
        this.TaskList.add(task);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Task> getTaskList() {
        return TaskList;
    }
}
