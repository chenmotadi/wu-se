package com.kongzhu.wupeiyang.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kongzhu.wupeiyang.entity.Fraction;
import com.kongzhu.wupeiyang.service.CourseService;
import com.kongzhu.wupeiyang.service.FractionService;
import com.kongzhu.wupeiyang.service.StudentService;

@Controller
@RequestMapping("/fraction")
public class FractionController {
	
	@Autowired
	private FractionService fractionService;
	@Autowired
	private StudentService studentService;
	@Autowired
	private CourseService courseService;
	
	public void forward(HttpServletRequest request, HttpServletResponse response,String path) throws ServletException, IOException {
		RequestDispatcher  dispatcher  = request.getRequestDispatcher(path);
		dispatcher.forward(request, response);
	}
	
	
	@RequestMapping("/selectScore")
	public void selectScore(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String courseName = request.getParameter("courseName");
		String studentName = request.getParameter("studentName");
		Integer courseId = courseService.selectCourse(courseName);
		Integer studentId =studentService.selectStudent(studentName);
		Fraction fraction = new Fraction();
		fraction.setCourseId(courseId);
		fraction.setStudentId(studentId);
		Integer score = fractionService.selectScore(fraction);
		 String json = score+"";
		 response.getWriter().append(json);
		
		
		
	}
	@RequestMapping("/")
	public String toScore(){
		
		return "Score";
	}

}
