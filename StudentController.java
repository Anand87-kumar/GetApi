package com.anand.getapi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anand.getapi.entity.Student;
import com.anand.getapi.service.StudentService;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/get")
    public List<Student> getAllStudentsSortedByName() {
        List<Student> sortedStudents = studentService.getAllStudentsSortedByDobAsc();
        return sortedStudents;
    }
}







