package com.bcampbell.discgolf.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bcampbell.discgolf.models.Course;
import com.bcampbell.discgolf.repositories.CourseRepository;

@RestController
@RequestMapping("/api/v1/discgolf")
public class CourseController {

	@Autowired
	private CourseRepository courseRepository;
	
	@GetMapping
	public List<Course> list() {
		return courseRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Course course) {
		courseRepository.save(course);
	}
	
	@GetMapping("/{id}")
	public Course get(@PathVariable("id") long id) {
		return courseRepository.getOne(id);
	}
	
}
