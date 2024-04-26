package com.session.service;

import java.util.List;

import com.session.entity.Students;

public interface StudentService {

	Students insertStudent(Students stud);

	List<Students> selectStudents();

	Students selectOneStude(int roll);

}
