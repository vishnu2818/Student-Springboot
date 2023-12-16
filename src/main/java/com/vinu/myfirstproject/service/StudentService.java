package com.vinu.myfirstproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinu.myfirstproject.entity.Student;
import com.vinu.myfirstproject.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository repo;

	public Student saveStudent(Student student) {
		return repo.save(student);
	}

	public List<Student> getAllStudent() {
		return repo.findAll();
	}

//	public Student updateStudent(int studentId) {
//		return repo.updateById(studentId);
//	}
	
	public String deleteStudent(Student student) {
		repo.delete(student);
		return "Successfully Deleted";
	}
}








