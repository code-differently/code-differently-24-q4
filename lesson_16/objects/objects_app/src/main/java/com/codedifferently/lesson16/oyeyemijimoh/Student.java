import java.time.LocalDate;
import java.util.List;

public class Student {
    private long studentNumber;
    private String fullName;
    private Department department;
    private String emailAddress;
    private List<String> phoneNumbers;
    private LocalDate dateOfBirth;

    public Student(long studentNumber, String fullName, Department department, String emailAddress, List<String> phoneNumbers, LocalDate dateOfBirth) {
        this.studentNumber = studentNumber;
        this.fullName = fullName;
        this.department = department;
        this.emailAddress = emailAddress;
        this.phoneNumbers = phoneNumbers;
        this.dateOfBirth = dateOfBirth;
    }

    public long getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(long studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNumber=" + studentNumber +
                ", fullName='" + fullName + '\'' +
                ", department=" + department +
                ", emailAddress='" + emailAddress + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
