package com.example.threeaday;

public class Task {

    private String description;
    private String type;
    private int id;

    public Task(String description, String type, int id) {
        this.description = description;
        this.type = type;
        this.id = id;
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
