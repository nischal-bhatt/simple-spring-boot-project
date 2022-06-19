package com.in28minutes.learnspringframework.courses.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.learnspringframework.courses.bean.Course;

@RestController
public class CourseController {

	@GetMapping("/courses")
	public List<Course> getAllCourses()
	{
		return Arrays.asList(new Course(2,"learn microservices","in28minutes"),
				new Course(3,"learn microservices","in28minutes"));
	}
	
}
