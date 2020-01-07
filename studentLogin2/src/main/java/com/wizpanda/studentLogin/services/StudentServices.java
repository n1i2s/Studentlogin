package com.wizpanda.studentLogin.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wizpanda.studentLogin.model.Student;

@Service
public interface StudentServices {


	public void studentCreate(Student student);
	public List<Student> studentListById(int studentId);
	public List<Student> studentList();
	public List<Student> findbyemail(String email);
}
