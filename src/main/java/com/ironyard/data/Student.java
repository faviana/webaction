package com.ironyard.data;

import java.util.List;

/**
 * Created by jasonskipper on 9/15/16.
 */
public class Student {
    private String firstName;
    private String lastName;
    private String ssn;
    private String age;
    private String gpa;
    private long id;
    private List<Assignment> assignments;

    public Student(String aFirstName, String aLastName, String aSsn, String aAge, String aGpa, long d) {
        this.firstName = aFirstName;
        this.lastName = aLastName;
        this.ssn = aSsn;
        this.age = aAge;
        this.gpa = aGpa;
        id = d;

    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<Assignment> assignments) {
        this.assignments = assignments;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String toString(){
        return getFirstName() + " " + getLastName();
    }
}
