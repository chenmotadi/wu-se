package com.kongzhu.wupeiyang.service;

import java.util.List;

import com.kongzhu.wupeiyang.entity.Course;

public interface CourseService {
	List<Course>  selectCourseList();
	Integer selectCourse(String courseName);

}
