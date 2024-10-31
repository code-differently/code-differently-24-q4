package com.codedifferently.lesson16.amiyahjones;

import java.util.ArrayList;

public class JobReadinessProgram {
    ArrayList<String> students;
    private final level readinessLevel = null;

    enum level {
        BEGINNER , 
        INTERMEDIATE , 
        ADVANCED
    }

    public JobReadinessProgram(){
        students = new ArrayList<>();
    }
    
    public void addStudent(String studentName){
    students.add(studentName);
   }

    public int getStudentCount() {
        int count = students.size();
        System.out.println("Total students enrolled: " + count);
        return count;
    }

    public String checkReadiness() {
        return (readinessLevel == level.INTERMEDIATE) ? "Ready for job applications!" : "Needs more training.";
    }
}
