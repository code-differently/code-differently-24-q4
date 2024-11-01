package com.codedifferently.lesson16.amiyahjones;

import java.util.ArrayList;
// import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class JobReadinessProgram {
    private final boolean isSuccessful; 
    ArrayList<String> students;
    private final Level readinessLevel;
    private final int lecturePerWeek;
    private static final HashMap<Integer, String> teacherAssistants;
    private String assignedTA;
    private final String mentor;
    private final String socialSupport;

    enum Level {
        Beginner , 
        Intermediate , 
        Advanced
    }

    public JobReadinessProgram(Level readinessLevel, boolean isSuccessful, String assignedTA){
        students = new ArrayList<>();
        this.readinessLevel = readinessLevel;
        this.isSuccessful = isSuccessful;
        lecturePerWeek = 3;
        this.assignedTA = null;
        mentor = "Anthony";
        socialSupport = "Estelle";
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
        return (readinessLevel == Level.Beginner) ? "Needs more training." : "Ready for job applications!";
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

    public String getMentor() {
        return mentor;
    }

    public String getSocialSupport() {
        return socialSupport;
    }

   public List<String> teacherAssistants() {
    return teacherAssistants;
   }
    
   public boolean assignTA(String taName) {
        if (teacherAssistants.contains(taName)) {
            this.assignedTA = taName;
            return true; 
        } else {
            System.out.println("Not a TA. Please choose from: " + teacherAssistants);
            return false; 
        }
    }

    public void displayAssignedTA() {
        if (assignedTA != null) {
            System.out.println("Assigned Teacher Assistant: " + assignedTA);
        } else {
            System.out.println("No Teacher Assistant assigned.");
        }
    }

}