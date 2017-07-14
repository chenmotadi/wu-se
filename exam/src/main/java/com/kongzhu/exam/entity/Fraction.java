package com.kongzhu.exam.entity;

public class Fraction {
	private Integer id;
	private Integer courseId;
	private Integer studentId;
	private Integer score;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public Fraction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fraction(Integer id, Integer courseId, Integer studentId, Integer score) {
		super();
		this.id = id;
		this.courseId = courseId;
		this.studentId = studentId;
		this.score = score;
	
	}
	public Fraction(Integer courseId, Integer studentId) {
		super();
		this.courseId = courseId;
		this.studentId = studentId;
	}
	@Override
	public String toString() {
		return "Fraction [id=" + id + ", courseId=" + courseId + ", studentId=" + studentId + ", score=" + score + "]";
	}
	
}
