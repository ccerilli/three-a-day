package com.example.threeaday;

public class Task {

    private int id;
    private String description;
    private String type;


    public Task(int id, String description, String type) {
        this.id = id;
        this.description = description;
        this.type = type;

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
