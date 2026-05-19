package org.example.service;

import org.example.model.Student;
import org.example.repository.StudentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.util.List;

class StudentServiceTest {

    private StudentRepository studentRepository;
    private StudentService service;

    List<Student> students = List.of(
            new Student(1, "Sakthivel", 21, 'A'),
            new Student(2, "Shaileas", 20, 'B'),
            new Student(3, "Nithya", 22, 'B'),
            new Student(4, "Adithya", 21, 'A')
    );

    @BeforeEach
    void setupMockObjects() throws SQLException {
        studentRepository = Mockito.mock(StudentRepository.class);
        service = new StudentService(studentRepository);

        Mockito.when(studentRepository.getStudentsList()).thenReturn(students);

        Mockito.when(studentRepository.getStudentWithId(Mockito.anyInt())).thenReturn(
                new Student(1, "Sakthivel", 21, 'A')
        );

        Mockito.when(studentRepository.getStudentsWithGrade(Mockito.anyChar())).thenThrow(
                new SQLException("DB Connection Error")
        );
    }

    @Test
    void testGetStudentsList() {
        List<Student> studentList = service.getStudentsList();

        assertEquals(4, studentList.size());

        Mockito.verify(studentRepository, Mockito.times(1)).getStudentsList();
    }

    @Test
    void testGetStudentWithId() {

        Student student1 = service.getStudentWithId(1);
        Student student2 = service.getStudentWithId(99);

        assertEquals(student1.getName(), student2.getName());

        Mockito.verify(studentRepository, Mockito.atLeast(1)).getStudentWithId(Mockito.anyInt());
    }

    @Test
    void testGetStudentsWithGrade() {

        assertThrows(SQLException.class, () -> service.getStudentsWithGrade('A'));
    }
}