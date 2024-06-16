package com.thisara.studentsystem.controller;

import com.thisara.studentsystem.model.Student;
import com.thisara.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
@Autowired
    private StudentService studentService;

@PostMapping("/add")
    public String add(@RequestBody Student student){
    studentService.saveStudent(student);
    return "new student added";
}
@GetMapping("/getAll")
    public List<Student> getAllStudents(){
    return studentService.getAllStudents();
}
}

