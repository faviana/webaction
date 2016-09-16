package com.ironyard.service;

import com.ironyard.data.Assignment;
import com.ironyard.data.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jasonskipper on 9/15/16.
 */
public class StudentService {

    public List<Student> getAllStudents(){
        List<Student> foundAll = new ArrayList<>();
        // create student
        Student tmpStudent = new Student("Tod", "Wall","555-55-5555","24","4.00",2);
        // create assignment list
        List<Assignment> tmpAssignments = new ArrayList<>();
        tmpAssignments.add(new Assignment("Blog", "95", "100", 2));
        tmpAssignments.add(new Assignment("Html", "87", "100", 3));
        tmpAssignments.add(new Assignment("FixItChallenge", "45", "50", 4));
        // set this students asssignments
        tmpStudent.setAssignments(tmpAssignments);
        // add our student to the list
        foundAll.add(tmpStudent);

        // create student
        tmpStudent = new Student("John", "Smith","222-22-2222","37","3.55",2);
        // create assignment list
        tmpAssignments = new ArrayList<>();
        tmpAssignments.add(new Assignment("Blog", "88", "100", 2));
        tmpAssignments.add(new Assignment("Html", "93", "100", 3));
        tmpAssignments.add(new Assignment("FixItChallenge", "44", "50", 4));
        // set this students asssignments
        tmpStudent.setAssignments(tmpAssignments);
        foundAll.add(tmpStudent);

        // create student
        tmpStudent = new Student("Bob Lob", "Law","123-45-6789","43","3.72",2);
        // create assignment list
        tmpAssignments = new ArrayList<>();
        tmpAssignments.add(new Assignment("Blog", "100", "100", 2));
        tmpAssignments.add(new Assignment("Html", "85", "100", 3));
        tmpAssignments.add(new Assignment("FixItChallenge", "47", "50", 4));
        // set this students asssignments
        tmpStudent.setAssignments(tmpAssignments);
        foundAll.add(tmpStudent);

        return foundAll;


    }

}
