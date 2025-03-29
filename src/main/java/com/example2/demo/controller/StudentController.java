package com.example2.demo.controller;

import com.example2.demo.entity.Student;
import com.example2.demo.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/addStudent")
    public void addStudent(@RequestBody Student student){
         studentService.saveStudent(student);
    }

    @GetMapping("/getAll")
    public List<Student> getAll(){
        return studentService.getAllStudents();
    }

}
