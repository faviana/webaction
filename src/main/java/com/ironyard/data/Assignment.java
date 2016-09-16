package com.ironyard.data;

/**
 * Created by nathanielellsworth on 9/15/16.
 */
public class Assignment {
    private String assignmentName;
    private String score;
    private String totalPointsPossible;
    private long id;

    public Assignment(String aAssignmentName, String aScore, String aTotalPointsPossible, long c) {
        assignmentName = aAssignmentName;
        score = aScore;
        totalPointsPossible = aTotalPointsPossible;
        id = c;
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getTotalPointsPossible() {
        return totalPointsPossible;
    }

    public void setTotalPointsPossible(String totalPointsPossible) {
        this.totalPointsPossible = totalPointsPossible;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String toString(){
        return getAssignmentName();
    }
}
