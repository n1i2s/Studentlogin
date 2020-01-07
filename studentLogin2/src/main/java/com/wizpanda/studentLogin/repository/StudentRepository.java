package com.wizpanda.studentLogin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wizpanda.studentLogin.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer > {

	List<Student> findByEmail(String email);

}
