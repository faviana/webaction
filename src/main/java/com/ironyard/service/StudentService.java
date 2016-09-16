package com.ironyard.service;

import com.ironyard.data.Assignment;
import com.ironyard.data.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jasonskipper on 9/15/16.
 */
public class StudentService {

    public List<Student> getAllStudents() {
        List<Student> foundAll = new ArrayList<>();

        List<Assignment> RaulAssignments = new ArrayList<>();
        RaulAssignments.add(new Assignment("Html Web Page ", 78.9, 100.0));
        RaulAssignments.add(new Assignment("Test", 65.7, 100.0));
        RaulAssignments.add(new Assignment("Blog", 90, 100.0));
        RaulAssignments.add(new Assignment("Final Project", 85.7, 100.0));

        List<Assignment> MaxAssignments = new ArrayList<>();
        MaxAssignments.add(new Assignment("Html Web Page", 91.4, 100.0));
        MaxAssignments.add(new Assignment("Test", 75.3, 100.0));
        MaxAssignments.add(new Assignment("Blog", 91.4, 100.0));
        MaxAssignments.add(new Assignment("Final Project", 75.3, 100.0));

        List<Assignment> MindyAssignments = new ArrayList<>();
        MindyAssignments.add(new Assignment("Html Web Page", 86.5, 100.0));
        MindyAssignments.add(new Assignment("Test", 98.7, 100.0));
        MindyAssignments.add(new Assignment("Blog", 86.5, 100.0));
        MindyAssignments.add(new Assignment("Final Project", 98.7, 100.0));

        List<Assignment> JohnyAssignments = new ArrayList<>();
        JohnyAssignments.add(new Assignment("Html Web Page", 35.8, 100.0));
        JohnyAssignments.add(new Assignment("Test", 75.9, 100.0));
        JohnyAssignments.add(new Assignment("Blog", 35.8, 100.0));
        JohnyAssignments.add(new Assignment("Final Project", 75.9, 100.0));


        foundAll.add(new Student("Raul", "Lavin", 3.55, 25, "111-555-4394", 1, RaulAssignments));
        foundAll.add(new Student("Max", "Johnson", 4.0, 30, "145-444-3897", 2, MaxAssignments));
        foundAll.add(new Student("Mindy", "Lawrence", 2.85, 22, "123-456-7890", 3, MindyAssignments));
        foundAll.add(new Student("Johnny", "Lavin", 2.42, 35, "155-555-1987", 4, JohnyAssignments));
        return foundAll;
    }
}
