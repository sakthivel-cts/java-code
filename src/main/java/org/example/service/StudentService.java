package org.example.service;

import org.example.model.Student;
import org.example.repository.StudentRepository;

import java.sql.SQLException;
import java.util.List;

public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudentsList() {
        return studentRepository.getStudentsList();
    }

    public List<Student> getStudentsWithGrade(char grade) throws SQLException {
        return studentRepository.getStudentsWithGrade(grade);
    }

    public Student getStudentWithId(int id) {
        return studentRepository.getStudentWithId(id);
    }
}