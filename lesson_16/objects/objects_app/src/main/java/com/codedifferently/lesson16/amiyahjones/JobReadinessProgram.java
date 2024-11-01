package com.codedifferently.lesson16.amiyahjones;

import java.util.ArrayList;
import java.util.List;

public class JobReadinessProgram {
    private final boolean isSuccessful; 
    ArrayList<String> students;
    private final Level readinessLevel;
    private final int lecturePerWeek;
    private static final ArrayList<String> teacherAssistants = new ArrayList<>();
    private String assignedTA;
    private final String mentor;
    private final String socialSupport;
    private final int MAX_CAPACITY = 22;

    static {
        teacherAssistants.add("Rich");
        teacherAssistants.add("Vicente");
        teacherAssistants.add("Jordan");
    }

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
        mentor = "Anthony";
        socialSupport = "Estelle";
        if (teacherAssistants.contains(assignedTA)) {
            this.assignedTA = assignedTA;
        }
    }
    
    public void addStudent(String studentName) throws ClassroomFullException{
    int classroomCheck = students.size();
    if (classroomCheck == MAX_CAPACITY) {
        throw new ClassroomFullException("Classroom is full");
    } students.add(studentName);
   }

    public int getStudentCount() {
        int count = students.size();
        System.out.println("Total students enrolled: " + count);
        return count;
    }

    public void displayStudents() {
    for (String student : students) {
        System.out.println(student);
    }
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

   public List<String> getTeacherAssistants() {
    return new ArrayList<>(teacherAssistants);
   }
    
   public boolean assignTA(String taName) {
        if (teacherAssistants.contains(taName)) {
            this.assignedTA = taName;
            return true; 
        } else {
            throw new IllegalArgumentException("Not a TA. Please choose from: " + getTeacherAssistants());
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