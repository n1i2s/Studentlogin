package com.wizpanda.studentLogin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;
	@NotNull
    @Size(min = 2, message = "Name should have atleast 2 characters")
	private String studentNama;
	@Email
	@NotBlank
	private String email;
	@NotNull
    @Size(min = 4,max=25, message = "password should have more then 4 characters and less then 25 characters")
	private String password;
	@NotNull
    @Size(min = 10,max=10, message = "mobile Number is not valid")
    @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$",
             message="Mobile number is invalid")
	private String mobile;
	
	//constructor without parameter
	Student(){}
	//constructor with fileds
	
	//getter and setter
	public String getStudentNama() {
		return studentNama;
	}

	
	public Student(int studentId, String studentNama, String email, String password, String mobile) {
		super();
		this.studentId = studentId;
		this.studentNama = studentNama;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
	}
	public void setStudentNama(String studentNama) {
		this.studentNama = studentNama;
	}

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	
	
}
