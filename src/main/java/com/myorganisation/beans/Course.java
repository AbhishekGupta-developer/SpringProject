package com.myorganisation.beans;

public class Course {
    private Long id;
    private String name;
    private Double fee;

    public Course(Long id, String name, Double fee) {
        this.id = id;
        this.name = name;
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fee=" + fee +
                '}';
    }
}
