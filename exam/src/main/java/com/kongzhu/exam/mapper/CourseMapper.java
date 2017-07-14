package com.kongzhu.exam.mapper;

import org.apache.ibatis.annotations.Param;

public interface CourseMapper {
	
	Integer selectId(String courseName);
	
}
