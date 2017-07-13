package com.kongzhu.wupeiyang.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kongzhu.wupeiyang.DAO.StudentDAO;
import com.kongzhu.wupeiyang.entity.Student;


@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentDAO studentdao;
	
	public List<Student> selectStudentList() {
		
		return studentdao.selectStudentList();
	}

	public Integer selectStudent(String studentName) {
		// TODO Auto-generated method stub
		return studentdao.selectStudent(studentName);
	}
	

}
