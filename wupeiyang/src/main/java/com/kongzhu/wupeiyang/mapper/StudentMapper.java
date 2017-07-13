package com.kongzhu.wupeiyang.mapper;

import java.util.List;

import com.kongzhu.wupeiyang.entity.Student;

public interface StudentMapper {
	
	List<Student>  selectStudentList();
	Integer selectStudent(String studentname);

}
