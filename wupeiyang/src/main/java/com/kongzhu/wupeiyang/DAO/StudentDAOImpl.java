package com.kongzhu.wupeiyang.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.kongzhu.wupeiyang.entity.Student;
import com.kongzhu.wupeiyang.mapper.StudentMapper;
@Repository
public class StudentDAOImpl extends BaseDAOImpl implements StudentDAO {

	public List<Student> selectStudentList() {
		SqlSession session=getsqlSession();
		try {
		StudentMapper mapper=session.getMapper(StudentMapper.class);
		return mapper.selectStudentList();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
	}

	public Integer selectStudent(String studentName) {
		SqlSession session=getsqlSession();
		try {
		StudentMapper mapper=session.getMapper(StudentMapper.class);
		return mapper.selectStudent(studentName);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
	}

}
