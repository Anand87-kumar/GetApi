package com.anand.getapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.anand.getapi.entity.Course;

@Service
public class CourseService {

	public List<Course> getAllCourses() {
		List<Course> courses = new ArrayList<Course>();
		
		courses.add(new Course(101,"Java"));
		return courses;
	}

}
