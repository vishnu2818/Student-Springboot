package com.vinu.myfirstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinu.myfirstproject.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	//Student updateById(int studentId);
}
