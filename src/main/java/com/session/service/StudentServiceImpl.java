package com.session.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.session.entity.Students;
import com.session.repositotry.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService{
	
	 @Autowired
	StudentRepository studentRepository;

	@Override
	public Students insertStudent(Students stud) {
     return studentRepository.save(stud);
     
	}

	@Override
	public List<Students> selectStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Students selectOneStude(int roll) {
		return studentRepository.getOne(null);
	} 

}
