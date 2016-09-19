package com.ironyard.data;

import java.util.List;

/**
 * Created by jasonskipper on 9/15/16.
 */
public class StudentItem {
    private String name;
    private String lastname;
    private String social;
    private long age;
    private double gpa;
    private long id;
    private List<AssignmentItem> assignments;


    public StudentItem(String aName, String aLastName, String aSocial, long aAge, double aGpa, long anId,
                       List<AssignmentItem> anAssignment){
        name = aName;
        lastname = aLastName;
        social= aSocial;
        age = aAge;
        gpa = aGpa;
        id = anId;
        assignments = anAssignment;
    }

    public List<AssignmentItem> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<AssignmentItem> assignments) {
        this.assignments = assignments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSocial() {
        return social;
    }

    public void setSocial(String social) {
        this.social = social;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
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
}


