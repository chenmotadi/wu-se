package com.kongzhu.exam.entity;

public class Student {
	private Integer id;
	private String studentName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Integer id, String studentName) {
		super();
		this.id = id;
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + "]";
	}
	
}
