package com.example2.demo.service;

import com.example2.demo.entity.Student;
import com.example2.demo.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
       return studentRepository.findAll();
    }
}
