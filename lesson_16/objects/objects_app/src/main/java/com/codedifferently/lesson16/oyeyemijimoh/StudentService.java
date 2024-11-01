import java.util.HashMap;
import java.util.Map;

public class StudentService {

  private final Map<Long, Student> students;

  public StudentService() {
    students = new HashMap<>();
  }

  private void checkIfStudentExist(long studentNumber) {
    if (students.containsKey(studentNumber)) {
      return;
    }
    throw new StudentNotFoundException("Student with number " + studentNumber + " not found");
  }

  public void deleteStudent(long studentNumber) {
    checkIfStudentExist(studentNumber);
    students.remove(studentNumber);
  }

  public void addStudent(Student student) {
    students.put(student.getStudentNumber(), student);
  }

  public int displayAllTechDeptStudents() {
    int count = 0;
    for (Student student : students.values()) {
      if (student.getDepartment().equals(Department.Technology)) {
        count++;
      }
    }
    return count;
  }
}
