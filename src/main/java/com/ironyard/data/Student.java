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

    public double getgpa() {
        double gpa = 0;
        int x = 0;
        // loop through assignemts
         for (Assignment tmp: assignments){
             if (gpa <= 100 && gpa  >= 90){
                 x = 4;
             }
               else if(gpa <= 89 && gpa >= 80){
                 x = 3;
             }
             else if(gpa <= 79 && gpa >= 70){
                 x = 2;
             }
              else if(gpa <= 69 && gpa >= 60){
                 x = 1;
             }
              else if(gpa <= 59 && gpa >= 0){
                 x = 0;
             }
             gpa = gpa + x;

         }

        gpa  = gpa / assignments.size();
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
    
}
