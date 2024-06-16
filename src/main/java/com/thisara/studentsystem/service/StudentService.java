package com.thisara.studentsystem.service;

import com.thisara.studentsystem.model.Student;
import java.util.List;

public interface StudentService {
    public Student saveStudent(Student Student);
    public List<Student> getAllStudents();
}
