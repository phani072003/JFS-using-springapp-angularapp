package com.example.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springapp.models.Student;
import com.example.springapp.repository.StudentRepo;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public boolean addStudent(Student student) {
        return studentRepo.save(student) != null;
    }

    public Optional<Student> getStudentById(int id) {
        return studentRepo.findById(id);
    }




    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

	
}
