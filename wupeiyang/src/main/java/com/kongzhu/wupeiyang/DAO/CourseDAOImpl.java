package com.kongzhu.wupeiyang.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.kongzhu.wupeiyang.entity.Course;
import com.kongzhu.wupeiyang.mapper.CourseMapper;

@Repository
public class CourseDAOImpl extends BaseDAOImpl implements  CourseDAO {

	public List<Course> selectCourseList() {
		SqlSession session=getsqlSession();
		try {
		CourseMapper mapper=session.getMapper(CourseMapper.class);
		return mapper.selectCourseList();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
	}

	public Integer selectCourse(String courseName) {
		SqlSession session=getsqlSession();
		try {
			CourseMapper mapper=session.getMapper(CourseMapper.class);
		return mapper.selectCourse(courseName);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
	}

}
