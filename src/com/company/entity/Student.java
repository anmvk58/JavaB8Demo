package com.company.entity;

public class Student {
    private int id;
    private String fullName;

    public Student(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Student name: " + fullName + "\n" +
                "Student ID: " + id;
    }
}
