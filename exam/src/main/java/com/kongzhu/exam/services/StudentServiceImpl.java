package com.kongzhu.exam.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kongzhu.exam.mapper.StudentMapper;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentMapper studentMapper;
	
	public Integer selectId(String studentName) {
		
		return studentMapper.selectId(studentName);
	}

}
