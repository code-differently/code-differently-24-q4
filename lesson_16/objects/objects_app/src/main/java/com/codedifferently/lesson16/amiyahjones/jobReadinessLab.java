package main.java.com.codedifferently.lesson16.amiyahjones;

import java.util.ArrayList;

public class JobReadinessLab {
    private final int mentorSession;
    private final String teacherAssistant, socialSupport, jobTutor;
    private boolean isSuccessful; 
    ArrayList<String> students;
    private final level readinessLevel;

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

    public String checkReadiness() {
        return (readinessLevel == level.INTERMEDIATE) ? "Ready for job applications!" : "Needs more training.";
    }

   public Boolean verifyIsSuccessful() {
    if (isSuccessful){
        System.out.println("Congraulations! You made it through your journey!");
    } else {
         System.out.println("At least you got to know what software engineering is like!");
    }
    return isSuccessful;
   }

   public int countStudents() {
    int count = students.size();
    System.out.println("Total students enrolles: " + count);
    return count;
   }

   public void addStudent(String studentName){
    students.add(studentName);
   }

   public void printStudents() {
    for (String student : students) {
        System.out.println(student);
    }
   }

   public int getMentorSession () {
    return mentorSession;
   }
   
   public String getTeacherAssistant() {
    return teacherAssistant;
    }

   public String getSocialSupport() {
        return socialSupport;
    }

   public String getJobTutor() {
        return jobTutor;
    }
}

