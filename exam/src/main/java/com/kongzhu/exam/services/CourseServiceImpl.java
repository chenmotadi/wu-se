package com.kongzhu.exam.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kongzhu.exam.mapper.CourseMapper;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseMapper courseMapper;
	
	public Integer selectId(String courseName) {
		
		return courseMapper.selectId(courseName);
	}

}
