package com.codedifferently.lesson16.amiyahjones;

import java.util.ArrayList;

public class JobReadinessProgram {
    private final boolean isSuccessful; 
    ArrayList<String> students;
    private final level readinessLevel;
    private final int lecturePerWeek;

    enum level {
        beginner , 
        intermediate , 
        advanced
    }

    public JobReadinessProgram(level readinessLevel, boolean isSuccessful){
        students = new ArrayList<>();
        this.readinessLevel = readinessLevel;
        this.isSuccessful = isSuccessful;
        lecturePerWeek = 3;
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

   public int lecturePerWeek() {
     System.out.println("Number of lectures students have: ");
     return lecturePerWeek;
   }
}
