package com.wizpanda.studentLogin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wizpanda.studentLogin.DAO.StudentDao;
import com.wizpanda.studentLogin.model.Student;

@Service
public class StudentServiceImplementation implements StudentServices {

	@Autowired
	private StudentDao studentDao;
	
	
	@Transactional
	@Override
	public void studentCreate(Student student) {
		// 
		studentDao.studentCreate(student);

	}

	@Transactional
	@Override
	public List<Student> studentListById(int studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public List<Student> studentList() {
		// TODO Auto-generated method stub
		return studentDao.studentList();
		
	}
	@Override
	public List<Student> findbyemail(String email) {
		return studentDao.findbyemail(email);
	}

}
