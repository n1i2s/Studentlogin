package com.wizpanda.studentLogin.studentController;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wizpanda.studentLogin.model.Student;
import com.wizpanda.studentLogin.model.StudentLogin;
import com.wizpanda.studentLogin.services.StudentServices;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentServices studentservice;

	@PostMapping("/login")
	public ResponseEntity<String> StudentLogin(@RequestBody StudentLogin studentlogin) {

		List<Student> student = studentservice.findbyemail(studentlogin.getStudentEmail());

		if (!student.isEmpty()) {
			if (student.get(0).getPassword().equals(studentlogin.getPassword())) {
				return new ResponseEntity<String>("valid", HttpStatus.OK);
			}
			else {
				return new ResponseEntity<String>("password is incorrect", HttpStatus.BAD_REQUEST);
			}
		}

		return new ResponseEntity<String>("user does not exits", HttpStatus.BAD_REQUEST);

	}

	@PostMapping("/create")
	// @ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<String> studentCreate(@Valid @RequestBody Student student) {

		// System.out.println(studentservice.findbyemail(student.getEmail()));
		if (!studentservice.findbyemail(student.getEmail()).isEmpty()) {
			return new ResponseEntity<String>("Email already exits", HttpStatus.BAD_REQUEST);
		} else
			studentservice.studentCreate(student);

		return new ResponseEntity<String>("Student created successfully", HttpStatus.OK);

	}

	@GetMapping("/students")
	public List<Student> studentList() {
		return studentservice.studentList();

	}

}
