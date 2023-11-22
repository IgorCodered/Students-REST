package ru.studentproject.crud.springstudents.service;

import org.springframework.stereotype.Service;
import ru.studentproject.crud.springstudents.model.Student;

import java.util.List;


public interface StudentService {
    List<Student> findAllStudents();
    Student saveStudent(Student student);
    Student findByEmail(String email);
    Student updateStudent(Student student);
    void deleteStudent(String email);
}
