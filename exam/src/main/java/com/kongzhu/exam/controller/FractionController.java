package com.kongzhu.exam.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kongzhu.exam.entity.Fraction;
import com.kongzhu.exam.services.CourseService;
import com.kongzhu.exam.services.FractionService;
import com.kongzhu.exam.services.StudentService;

@Controller
@RequestMapping("/fraction")
public class FractionController {
	
//	public void forward(HttpServletRequest request, HttpServletResponse response,String path) throws ServletException, IOException {
//		RequestDispatcher  dispatcher  = request.getRequestDispatcher(path);
//		dispatcher.forward(request, response);
//	}
	
	@Autowired
	private StudentService studentService;
	@Autowired
	private CourseService courseService;
	@Autowired
	private FractionService fractionService;
	
	
	@RequestMapping("/selectScore")
	public void selectScore(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String courseName = request.getParameter("courseName");
		String studentName = request.getParameter("studentName");
		Integer	 courseId = courseService.selectId(courseName);
		Integer	 studentId = studentService.selectId(studentName);
		Fraction fraction = new Fraction();
		fraction.setCourseId(courseId);
		fraction.setStudentId(studentId);
		Integer score = fractionService.selectScore(fraction); 
		String json = score+"";
		response.getWriter().append(json);
	}

	

}
