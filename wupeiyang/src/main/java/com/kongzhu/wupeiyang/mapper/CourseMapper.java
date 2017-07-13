package com.kongzhu.wupeiyang.mapper;

import java.util.List;

import com.kongzhu.wupeiyang.entity.Course;


public interface CourseMapper {
	
	List<Course>  selectCourseList();
	Integer selectCourse(String courseName);

}
