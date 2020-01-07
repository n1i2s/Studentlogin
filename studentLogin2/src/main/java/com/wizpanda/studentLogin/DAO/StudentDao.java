package com.wizpanda.studentLogin.DAO;

import java.util.List;

import com.wizpanda.studentLogin.model.Student;

public interface StudentDao {

	
	public void studentCreate(Student student);
	public List<Student> studentListById(int studentId);
	public List<Student> studentList();
	public List<Student> findbyemail(String email);
}
