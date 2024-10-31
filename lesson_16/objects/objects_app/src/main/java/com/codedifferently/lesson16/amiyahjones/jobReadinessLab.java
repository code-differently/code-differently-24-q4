package main.java.com.codedifferently.lesson16.amiyahjones;

import java.util.ArrayList;

public class JobReadinessLab {
    private int mentorSession;
    private String teacherAssistant, socialSupport, jobTutor;
    private boolean isSuccessful; 
    ArrayList<String> students;
    private level readinessLevel;

    enum level {
        BEGINNER , 
        INTERMEDIATE , 
        ADVANCED
    }

    public JobReadinessLab(String teacherAssistant, int mentorSession){
        this.mentorSession = mentorSession;
        this.teacherAssistant = teacherAssistant;
        socialSupport = "Estelle";
        jobTutor = "Anthony";
        students = new ArrayList<>();
        readinessLevel = level.BEGINNER;
    }

   public Boolean verifyisSuccessful() {
    if (!isSuccessful){
        System.out.println("At least you got to know what software engineering is like!");
    }
    return isSuccessful;
   }

   public int getStudentCount() {
    return students.size();
   }
}

