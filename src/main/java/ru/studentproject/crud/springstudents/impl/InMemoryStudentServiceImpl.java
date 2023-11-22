package ru.studentproject.crud.springstudents.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.studentproject.crud.springstudents.model.Student;
import ru.studentproject.crud.springstudents.repository.InMemoryStudentDAO;
import ru.studentproject.crud.springstudents.service.StudentService;

import java.util.List;
@Service
@AllArgsConstructor
public class InMemoryStudentServiceImpl implements StudentService {
    private final InMemoryStudentDAO repository;
    @Override
    public List<Student> findAllStudents() {
        return repository.findAllStudents();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);
    }
}
