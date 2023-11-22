package ru.studentproject.crud.springstudents.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.studentproject.crud.springstudents.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    void deleteByEmail(String email);
    Student findStudentByEmail(String email);
}
