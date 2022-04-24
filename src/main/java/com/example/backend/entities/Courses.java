package com.example.backend.entities;

public class Courses {
    private int Id;
    private String title;
    private String description;


    public Courses() {
        super();
    }

    public Courses(int id, String title, String description) {
        super();
        Id = id;
        this.title = title;
        this.description = description;
    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "Id=" + Id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
