package com.kongzhu.wupeiyang.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kongzhu.wupeiyang.DAO.CourseDAO;
import com.kongzhu.wupeiyang.entity.Course;
@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseDAO  coursedao;
	public List<Course> selectCourseList() {
		return coursedao.selectCourseList();
	}

	public Integer selectCourse(String courseName) {
		return coursedao.selectCourse(courseName);
	}
	

}
