package com.wizpanda.studentLogin.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wizpanda.studentLogin.model.Student;
import com.wizpanda.studentLogin.repository.StudentRepository;


@Repository
public class StudentDaoImplementation implements StudentDao {

	@Autowired
	StudentRepository studentRepository;


	@Override
	public void studentCreate(Student student) {
		studentRepository.save(student);

	}

	@Override
	public List<Student> studentListById(int studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> studentList() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
		//return null;
	}

	@Override
	public List<Student> findbyemail(String email) {
		return studentRepository.findByEmail(email);
	}

}
