package com.ironyard.data;

import java.util.List;

/**
 * Created by jasonskipper on 9/15/16.
 */
public class Student {
    private String name;
    private String last;
    private long id;
    private List<Assignment> assignments;
    private String ssn;
    private int age;
    private double gpa;


    public Student(String aName, String aLast, int aAge, String assn, long anId,
                   List<Assignment> StudentAssignments) {
        name = aName;
        last = aLast;
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

    public double getScore() {
        double gpa = 0;
        double score = 0;
        int x = 0;
        // loop through assignemts
        for (Assignment tmp : assignments) {
            if (tmp.getScore() <= 100 && tmp.getScore() >= 90) {
                x = 4;
            } else if (tmp.getScore() <= 89 && tmp.getScore() >= 80) {
                x = 3;
            } else if (tmp.getScore() <= 79 && tmp.getScore() >= 70) {
                x = 2;
            } else if (tmp.getScore() <= 69 && tmp.getScore() >= 60) {
                x = 1;
            } else if (tmp.getScore() <= 59 && tmp.getScore() >= 0) {
                x = 0;
            }
            score = score + x;

        }

        gpa = score / assignments.size();
        return gpa;
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

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}


