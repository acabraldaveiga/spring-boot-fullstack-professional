package com.example.springbootfullstackprofessional.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {
    
    @GetMapping
    public List<Student> getAllStudents() {
        List<Student> studentList = Arrays.asList(
                new Student(1L, "Lass", "ami", Gender.MALE),
                new Student(2L, "Camila", "ami", Gender.FEMALE)
        );
        
        return studentList;
    }
}
