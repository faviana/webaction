package com.ironyard.service;

import com.ironyard.data.Grade;
import com.ironyard.data.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jasonskipper on 9/15/16.
 */
public class StudentService {



    public List<Student> getAllStudents() {


        List<Student> foundAll = new ArrayList<>();
        List<Grade> myGrades = new ArrayList<>();




        Student jack = new Student("Jack", "Smith", "16", "123-123-123", "3.04", "Get Grades", 1, myGrades);
        myGrades = new ArrayList<>();
        myGrades.add(new Grade("Homework 1", 100, 90, 1));
        jack.setMyGrades(myGrades);
        foundAll.add(jack);

        Student jane = new Student("Jane", "Williams", "15", "456-456-456", "3.82", "Get Grades", 2, myGrades);
        myGrades = new ArrayList<>();
        myGrades.add(new Grade("Pop Quiz 3", 30, 25, 2));
        jane.setMyGrades(myGrades);
        foundAll.add(jane);

        Student jill = new Student("Jill", "Jones", "18", "789-789-789", "2.90", "Get Grades", 3, myGrades);
        myGrades = new ArrayList<>();
        myGrades.add(new Grade("Test 9", 40, 37, 3));
        jill.setMyGrades(myGrades);
        foundAll.add(jill);

        Student john = new Student("John", "Davidson", "14", "012-012-012", "3.68", "Get Grades", 4, myGrades);
        myGrades = new ArrayList<>();
        myGrades.add(new Grade("Assignment 4", 15, 12, 4));
        john.setMyGrades(myGrades);
        foundAll.add(john);


        return foundAll;
    }



}

