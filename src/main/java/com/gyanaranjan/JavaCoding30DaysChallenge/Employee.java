package com.gyanaranjan.JavaCoding30DaysChallenge;

public class Employee {
    private  String name;
    private  String grade;

    public Employee(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
