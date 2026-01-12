package org.example.models;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private int rollNumber;
    private int marks;
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Student(int rollNumber, int marks, String name){
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.name = name;
    }

    public Student(){

    }

    public int compareTo(Student s){
       return  Integer.compare(this.rollNumber, s.rollNumber);
    }
}
