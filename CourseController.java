package com.anand.getapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anand.getapi.entity.Course;
import com.anand.getapi.service.CourseService;

@RestController
@RequestMapping("/api/course")
public class CourseController {
	
	private final CourseService courseService;
	
	@Autowired
	public CourseController(CourseService courseService) {
		this.courseService=courseService;
	}
	@GetMapping("/get")
	public List<Course> getAllCourses(){
		return courseService.getAllCourses();
		
	}

}
