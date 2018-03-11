package com.springbootdev.examples.microservices.courseservice.model;


public class Course {

    private Integer id;
    private String name;
    private String medium;

    public Course(Integer id, String name, String medium) {
        this.id = id;
        this.medium = medium;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
