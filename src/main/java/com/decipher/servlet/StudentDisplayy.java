package com.decipher.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.decipher.model.Student;
import com.decipher.service.StudentService;


/**
 * Servlet implementation class StudentDisplayy
 */
public class StudentDisplayy extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		StudentService studentService = new StudentService();
	
		HttpSession session = request.getSession();
        String name = session.getAttribute("name").toString();
       
        ArrayList<Student> studentList = studentService.Studentdisplay(name);
	
        session.setAttribute("studentlist",studentList);
		
        response.sendRedirect("studentdisplay.jsp");	
        
         	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
