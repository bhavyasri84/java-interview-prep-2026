package org.example;

import org.example.models.Student;

import java.util.*;

public class ComparableVsComparator {


    public static void main(String[] args) {

        Student s1 = new Student(3,100,"Bhavya");
        Student s2 = new Student(1,90,"Kavya");
        Student s3 = new Student(2,80,"Aneha");

        List<Student> studentlist = Arrays.asList(s1,s2,s3);


        Collections.sort(studentlist);
        //No new list was returned — the original list is modified.

        for (Student student : studentlist) {
            System.out.println(student);
        }

        //Comparable is used to define natural ordering of objects inside the class using compareTo(),
        // while Comparator is used to define multiple external sorting logics using compare() without modifying the class.

        Comparator<Student> orderByName = (student1,student2) -> student1.getName().compareTo(student2.getName());
        Collections.sort(studentlist, orderByName);
        for (Student student : studentlist) {
            System.out.println(student);
    }}







}


