package com.wizpanda.studentLogin.model;


public class StudentLogin {

	private String studentEmail;
	private String password;
	
	//constructor
	StudentLogin(){
		
	}
	
	//Constructor with fields
	public StudentLogin(String studentEmail, String password) {
		super();
		this.studentEmail = studentEmail;
		this.password = password;
	}

//getter and setter
	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
