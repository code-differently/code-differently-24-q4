
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StudentServiceTest {

    StudentService classUnderTest;
     Map<Long, Student> students;
    
    @BeforeEach
    public void setUp(){
       classUnderTest = new StudentService();

       students = new HashMap<>();

       List<String> phoneNumbers1 = new ArrayList<>();
       phoneNumbers1.add("301-999-3222");
       phoneNumbers1.add("301-211-3222");
       phoneNumbers1.add("301-212-3777");

       Student student1 = new Student(
                112453698l,
                "Jane Doe",
                Department.Finance,
                "janedoe@gmail.com",
                phoneNumbers1,
                LocalDate.of(2021, 11, 20)
        );

       List<String> phoneNumbers2 = new ArrayList<>();
       phoneNumbers2.add("301-777-3222");
       phoneNumbers2.add("301-777-3222");
       phoneNumbers2.add("301-777-3777");

       Student student2 = new Student(
               712453698l,
               "Johnie Walker",
               Department.Technology,
               "johnie@gmail.com",
               phoneNumbers2,
               LocalDate.of(2021, 10, 26)
        );

       List<String> phoneNumbers3 = new ArrayList<>();
       phoneNumbers2.add("303-999-3222");
       phoneNumbers2.add("303-999-3222");
       phoneNumbers2.add("303-999-3777");

       Student student3 = new Student(
               912453698l,
               "Fannie May",
               Department.Technology,
               "fannie@gmail.com",
               phoneNumbers3,
               LocalDate.of(2017, 9, 26)
       );

       students.put(112453698l, student1);
       students.put(712453698l, student2);
       students.put(912453698l, student3);

       classUnderTest.addStudent(student1);
       classUnderTest.addStudent(student2);
       classUnderTest.addStudent(student3);
    }

    @Test
    public void testDeleteStudent_throw_Exception_IFNumber_Not_Found(){
        //Arrange
        Student student = new Student(
            44444444l,
            "Gonnie ByeBye",
            Department.Technology,
            "gonnie@gmail.com",
            null,
            LocalDate.of(2019, 10, 21)
        );
        classUnderTest.addStudent(student);
        //Act
        classUnderTest.deleteStudent(student.getStudentNumber());

        //Assert
        long studentNumber = 44444444l;
        assertThatThrownBy(() -> classUnderTest.deleteStudent(studentNumber))
         .isInstanceOf(StudentNotFoundException.class)
         .hasMessage("Student with number " + studentNumber + " not found"); 
    }

    @Test
    public void testDisplayAllTechDeptStudents(){
        Student student = new Student(
            44444444l,
            "Gonnie ByeBye",
            Department.Technology,
            "gonnie@gmail.com",
            null,
            LocalDate.of(2019, 10, 21)
        );
        classUnderTest.addStudent(student);
        //Act
        int numOfTechStudents = classUnderTest.displayAllTechDeptStudents();

        //Assert
        int expectedCount = 3;
        assertEquals(expectedCount, numOfTechStudents);
    }
    
    @Test
    public void testAddStudent(){
        //Arrange
        Student student = new Student(
            44444444l,
            "Gonnie ByeBye",
            Department.Technology,
            "gonnie@gmail.com",
            null,
            LocalDate.of(2019, 10, 21)
        );
       
        //Act
         classUnderTest.addStudent(student);

        //Assert
        int expectedCount = 3;
        assertEquals(expectedCount, students.size());
    }
    



}
