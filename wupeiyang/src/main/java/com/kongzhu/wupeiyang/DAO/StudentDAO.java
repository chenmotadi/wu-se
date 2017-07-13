package com.kongzhu.wupeiyang.DAO;

import java.util.List;

import com.kongzhu.wupeiyang.entity.Student;

public interface StudentDAO {
	List<Student>  selectStudentList();
	Integer selectStudent(String studentName);

}
