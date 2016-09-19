package com.ironyard.data;

/**
 * Created by sam on 9/15/16.
 */
public class Grade {
    public String assignmentname;
    public int possiblepoints;
    public int pointsawarded;
    public long id;



    public String getAssignmentname() { return assignmentname; }

    public void setAssignmentname(String assignmentname) { this.assignmentname = assignmentname; }

    public int getPossiblepoints() { return possiblepoints; }

    public void setPossiblepoints(int possiblepoints) { this.possiblepoints = possiblepoints; }

    public int getPointsawarded() { return pointsawarded; }

    public void setPointsawarded(int pointsawarded) { this.pointsawarded = pointsawarded; }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }





    public Grade(String AssignmentName, int PossiblePoints, int PointsAwarded, long anId){
        assignmentname = AssignmentName;
        possiblepoints = PossiblePoints;
        pointsawarded = PointsAwarded;
        id = anId;

    }


}
