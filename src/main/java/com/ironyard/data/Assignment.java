package com.ironyard.data;

/**
 * Created by Raul on 9/15/16.
 */
public class Assignment {

    private String assignt;
    public double score;
    private double totalpossible;

    public Assignment(String aAssignment, double ascore, double atotalpossible ){

        assignt = aAssignment;
        score = ascore;
        totalpossible = atotalpossible;
    }

    public String getAssignt() {
        return assignt;
    }

    public void setAssignt(String assignt) {
        this.assignt = assignt;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getTotalpossible() {
        return totalpossible;
    }

    public void setTotalpossible(double totalpossible) {
        this.totalpossible = totalpossible;
    }
}
