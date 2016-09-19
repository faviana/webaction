package com.ironyard.data;

import java.util.List;


/**
 * Created by jasonskipper on 9/15/16.
 */
public class Student {
    private String firstname;
    private String lastname;
    private String ssn;
    private String age;
    private String gpa;
    private String detail;
    private long id;
    private List<Grade> myGrades;





    public List<Grade> getMyGrades(List<Grade> myGrades) { return this.myGrades; }

    public void setMyGrades(List<Grade> myGrades) { this.myGrades = myGrades; }


    public String getSsn() { return ssn; }

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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String toString() {
        return getLastname();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    public Student(String aFirstName, String aLastName, String aSSN, String anAge, String aGPA, String aDetail, long anId, List<Grade> aGrade) {
        firstname = aFirstName;
        lastname = aLastName;
        ssn = aSSN;
        age = anAge;
        gpa = aGPA;
        detail = aDetail;
        id = anId;
        myGrades = aGrade;
    }




}
