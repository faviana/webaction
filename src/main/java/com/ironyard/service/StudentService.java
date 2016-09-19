package com.ironyard.service;

import com.ironyard.data.AssignmentItem;
import com.ironyard.data.StudentItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jasonskipper on 9/15/16.
 */
public class StudentService {

    public List<StudentItem> getAllStudentItems(){

        List<StudentItem> foundAll = new ArrayList<>();

        List<AssignmentItem> tmpAssignmentList = new ArrayList<>();
        tmpAssignmentList.add(new AssignmentItem ("Java",100,100));
        tmpAssignmentList.add(new AssignmentItem ("HTML",100,100));
        tmpAssignmentList.add(new AssignmentItem ("Blog",100,100));
        tmpAssignmentList.add(new AssignmentItem ("Web", 100,100));
        StudentItem tmpStudent = new StudentItem("Catherine", "Smith", "123-45-6789", 23, 4.0, 1, tmpAssignmentList);
        foundAll.add(tmpStudent);

        tmpAssignmentList = new ArrayList<>();
        tmpAssignmentList.add(new AssignmentItem ("Java",90,100));
        tmpAssignmentList.add(new AssignmentItem ("HTML",90,100));
        tmpAssignmentList.add(new AssignmentItem ("Blog",90,100));
        tmpAssignmentList.add(new AssignmentItem ("Web", 90,100));
        tmpStudent = new StudentItem("John", "Williams", "101-11-2131", 23, 3.5, 2, tmpAssignmentList);
        foundAll.add(tmpStudent);

        tmpAssignmentList = new ArrayList<>();
        tmpAssignmentList.add(new AssignmentItem ("Java",80,100));
        tmpAssignmentList.add(new AssignmentItem ("HTML",80,100));
        tmpAssignmentList.add(new AssignmentItem ("Blog",80,100));
        tmpAssignmentList.add(new AssignmentItem ("Web", 80,100));
        tmpStudent = new StudentItem("Karla", "Guzman", "415-16-1718", 23, 3.0, 3, tmpAssignmentList);
        foundAll.add(tmpStudent);

        tmpAssignmentList = new ArrayList<>();
        tmpAssignmentList.add(new AssignmentItem ("Java",70,100));
        tmpAssignmentList.add(new AssignmentItem ("HTML",70,100));
        tmpAssignmentList.add(new AssignmentItem ("Blog",70,100));
        tmpAssignmentList.add(new AssignmentItem ("Web", 70,100));
        tmpStudent = new StudentItem("Paul", "Martinez", "192-02-1222", 23, 2.0, 4, tmpAssignmentList);
        foundAll.add(tmpStudent);

        return foundAll;
    }

}

