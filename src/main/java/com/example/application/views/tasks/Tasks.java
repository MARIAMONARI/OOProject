package com.example.application.views.tasks;

public class Tasks {


    private String unit;
    private String task;
    private String date;
    private Boolean done;
    private String likes;
    private String comments;
    private String shares;

    public Tasks() {
    }


    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean getDone() {
        return done;
    }

    public void setDone(String done) {
        this.done = done;
    }


}
