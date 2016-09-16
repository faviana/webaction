package com.ironyard.data;

import java.util.List;

/**
 * Created by jasonskipper on 9/15/16.
 */
public class Student {
    private String name;
    private String last;
    private double gpa;
    private long id;
    private List<Assignment> assignments;
    private String ssn;
    private int age;


    public Student(String aName, String aLast, double agpa, int aAge, String assn, long anId,
                   List<Assignment> StudentAssignments) {
        name = aName;
        last = aLast;
        gpa = agpa;
        age = aAge;
        ssn = assn;
        id = anId;
        assignments = StudentAssignments;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<Assignment> assignments) {
        this.assignments = assignments;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return getName();
    }
}
