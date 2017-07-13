package com.kongzhu.wupeiyang.entity;

public class Student {
	private Integer id;
	private Integer studentName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getStudentName() {
		return studentName;
	}
	public void setStudentName(Integer studentName) {
		this.studentName = studentName;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Integer id, Integer studentName) {
		super();
		this.id = id;
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + "]";
	}
	
}
