package com.vinu.myfirstproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vinu.myfirstproject.entity.Student;
import com.vinu.myfirstproject.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping(path = "/save-student")
	public Student saveStudent(@RequestBody Student student) 
	{
		return service.saveStudent(student);
	}
	
	@GetMapping(path = "/fetch-all-student")
	public List<Student> getAllStudent() {
		return service.getAllStudent();
	}
	
//	@PostMapping(path = "/update-student")
//	public Student updateStudent(@RequestBody int studentId) 
//	{
//		return service.updateStudent(studentId);
//	}
	
	@PostMapping(path = "/delete-student")
	public String deleteStudent(@RequestBody Student student) 
	{
		return service.deleteStudent(student);
	}
}

