package com.myorganisation.beans;

public class Student {
    private Long id;
    private String name;
    private Course course;

    public Student(Long id, String name, Course course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
