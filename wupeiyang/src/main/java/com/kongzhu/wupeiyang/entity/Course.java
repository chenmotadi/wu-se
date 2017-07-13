package com.kongzhu.wupeiyang.entity;

public class Course {
	private Integer id;
	private String courseName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(Integer id, String courseName) {
		super();
		this.id = id;
		this.courseName = courseName;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + "]";
	}
	

}
