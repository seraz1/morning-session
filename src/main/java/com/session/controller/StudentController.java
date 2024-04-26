package com.session.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.session.entity.Students;
import com.session.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService  studentService;
	
	@GetMapping("/test server")
	public String test() {
	return "server is working fine";
	}
	
	 @PostMapping("/insert")
     public Students insertTeacher(@RequestBody Students stud) {
   	  Students  t = studentService.insertStudent(stud);
	   return t;
	
	}
	 
	 @GetMapping("/select")
     public List<Students> selectTeach() {
   	return  studentService.selectStudents();  
	
	 }
	 
	 @GetMapping("/select/roll/{roll}")
     public Students selectStudeByroll(@PathVariable int roll) {
   	return  studentService.selectOneStude(roll);
}
}	 
	 

