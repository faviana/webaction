package com.ironyard.data;

/**
 * Created by favianalopez on 9/16/16.
 */
public class AssignmentItem {

    private String assignmentName;
    private int grade;
    private int possible;

    public AssignmentItem (String aName, int aGrade, int aPossible) {

        grade = aGrade;
        assignmentName = aName;
        possible = aPossible;
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getPossible() {
        return possible;
    }

    public void setPossible(int possible) {
        this.possible = possible;
    }
}
