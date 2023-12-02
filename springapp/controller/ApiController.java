package com.example.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.springapp.models.Student;
import com.example.springapp.service.StudentService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class ApiController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public boolean addStudent(@RequestBody Student student) {
        // Do not set the ID explicitly; let JPA handle it.
        return studentService.addStudent(student);
    }

    @GetMapping("/getById/{studentId}")
    public Optional<Student> getStudentById(@PathVariable int studentId) {
        return studentService.getStudentById(studentId);
    }




    @GetMapping("/getAllStudent")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}
