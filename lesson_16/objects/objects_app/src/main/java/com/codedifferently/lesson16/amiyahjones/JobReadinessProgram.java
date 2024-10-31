package com.codedifferently.lesson16.amiyahjones;

import java.util.ArrayList;

public class JobReadinessProgram {
    private boolean isSuccessful; 
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

    public Boolean verifyIsSuccessful() {
    if (isSuccessful){
        System.out.println("Congraulations! You made it through your journey!");
    } else {
         System.out.println("At least you got to know what software engineering is like!");
    }
    return isSuccessful;
   }
}
