package com.kongzhu.wupeiyang.service;

import java.util.List;

import com.kongzhu.wupeiyang.entity.Student;

public interface StudentService {
	List<Student>  selectStudentList();
	Integer selectStudent(String studentName);

}
