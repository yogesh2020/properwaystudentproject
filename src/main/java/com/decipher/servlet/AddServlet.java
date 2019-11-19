package com.decipher.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.decipher.service.StudentService;
/**
 *  response.sendRedirect("display");
 * Servlet implementation class AddServlet
 */
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		StudentService studentService = new StudentService();
		
		 String subject = request.getParameter("subject");
		String mark = request.getParameter("mark");
		
		HttpSession session = request.getSession();
		String name = session.getAttribute("name").toString();
		
		studentService.addSubject(name,subject,mark);
//		 response.sendRedirect("display");
		/*
		 * response.sendRedirect("student");
		 */		 
		}
         }