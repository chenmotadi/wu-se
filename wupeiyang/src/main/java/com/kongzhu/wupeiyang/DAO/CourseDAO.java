package com.kongzhu.wupeiyang.DAO;

import java.util.List;

import com.kongzhu.wupeiyang.entity.Course;

public interface CourseDAO {
	List<Course>  selectCourseList();
	Integer selectCourse(String courseName);

}
