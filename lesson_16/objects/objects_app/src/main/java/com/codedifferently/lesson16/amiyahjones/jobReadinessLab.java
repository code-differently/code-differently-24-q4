package main.java.com.codedifferently.lesson16.amiyahjones;

import java.util.ArrayList;

public class JobReadinessLab {
    int mentorSession;
    String teacherAssistant; 
    String socialSupport;
    String jobTutor;
    boolean isSuccessful;
    ArrayList<String> students;
    level readinessLevel;

    enum level {
        BEGINNER , 
        INTERMEDIATE , 
        ADVANCED

    }

    JobReadinessLab(String teacherAssistant, int mentorSession){
        this.mentorSession = mentorSession;
        this.teacherAssistant = teacherAssistant;
        socialSupport = "Estelle";
        jobTutor = "Anthony";
        students = new ArrayList<>();
        readinessLevel = level.BEGINNER;
    }

   
}

