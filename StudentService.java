package com.anand.getapi.service;

import org.springframework.stereotype.Service;
import com.anand.getapi.entity.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    // Simulated data retrieval - replace this with actual database or service calls

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();

        // Fetch or create the list of students, here's a simulated example
        students.add(new Student(1001, "Anand", "Kumar", "31/10/2023"));
        students.add(new Student(1002, "Hari", "Om", "09/07/2023"));
        students.add(new Student(1003, "Rahul", "Sharm", "10/01/2023"));
        students.add(new Student(1004, "Rohit", "Verma", "26/08/2023"));
        students.add(new Student(1005, "Naval", "Kishore", "01/05/2023"));

        // Add more students as needed...

        return students;
    }

    public List<Student> getAllStudentsSortedByDobAsc() {
        List<Student> students = getAllStudents(); // Fetching the list of students
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Student> sortedStudents = students.stream()
                .sorted(Comparator.comparing(s -> {
                    try {
                        return sdf.parse(s.getDob());
                    } catch (ParseException e) {
                        e.printStackTrace(); // Handle the exception as needed
                        return null;
                    }
                }))
                .collect(Collectors.toList());

        return sortedStudents; // Add the missing return statement
    }
}
