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

    JobReadinessLab(String jTeacher, int jSessions){
        mentorSession = jSessions;
        teacherAssistant = jTeacher;
        socialSupport = "Estelle";
        jobTutor = "Anthony";
        students = new ArrayList<>();
        readinessLevel = level.BEGINNER;
    }

   
}

