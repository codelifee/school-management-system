package com.codelifee.schoolmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codelifee.schoolmanagement.model.Student;
import com.codelifee.schoolmanagement.model.StudentService;

@RestController
public class StudentRestController {

	@Autowired
	StudentService service;
	
	@RequestMapping(path="/todos")
	public List<Student> retrieveAllTodos() {
		return service.retrieveStudents("codelifee");
	}
	
	@RequestMapping(path="/todos/{id}")
	public Student retrieveTodo(@PathVariable int id) {
		return service.retrieveStudent(id);
	}
}
