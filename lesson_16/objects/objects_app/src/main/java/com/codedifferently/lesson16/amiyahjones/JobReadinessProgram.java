package com.codedifferently.lesson16.amiyahjones;

import java.util.ArrayList;

public class JobReadinessProgram {
    ArrayList<String> students;
    private final level readinessLevel;

    enum level {
        beginner , 
        intermediate , 
        advanced
    }

    public JobReadinessProgram(level readinessLevel){
        students = new ArrayList<>();
        this.readinessLevel = readinessLevel;
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
        return (readinessLevel == level.beginner) ? "Needs more training." : "Ready for job applications!";
    }
}
