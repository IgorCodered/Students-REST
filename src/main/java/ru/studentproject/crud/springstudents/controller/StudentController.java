package ru.studentproject.crud.springstudents.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.studentproject.crud.springstudents.model.Student;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    @GetMapping()
    public List<Student> findAllStudents() {
        return List.of(
                Student.builder().firstName("Олег").lastName("Елесин").email("olegelesin1996@mail.ru").age(50).build(),
                Student.builder().firstName("Марина").lastName("Цветаева").email("marinaemail@hotmail.com").age(20).build(),
                Student.builder().firstName("Крэк").lastName("Ламоткин").email("crackLobanov@yahoo.ru").age(34).build()
        );
    }
}
