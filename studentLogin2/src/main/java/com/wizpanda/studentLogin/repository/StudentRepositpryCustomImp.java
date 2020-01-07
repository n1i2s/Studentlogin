package com.wizpanda.studentLogin.repository;

import java.util.List;

import javax.persistence.EntityManager;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;

import com.wizpanda.studentLogin.model.Student;

public class StudentRepositpryCustomImp implements StudentRepositoryCustom {

	@Autowired
	EntityManager entitymanager;
	@Override
	public List<Student> findByEmail(String email) {
	javax.persistence.Query query= entitymanager.createQuery("from Student where email:email");
	query.setParameter(email, email);
	return query.getResultList();
	}

}
