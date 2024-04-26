package com.session.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Students {
	 @Id
	private int rollNumber;
	private String studentName;
	public Students(int rollNumber, String studentName) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Students [rollNumber=" + rollNumber + ", studentName=" + studentName + "]";
	}
	public Students() {
		super();
	}

}
