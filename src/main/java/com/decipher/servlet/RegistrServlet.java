package com.decipher.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.decipher.model.Student;
import com.decipher.service.StudentService;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegistrServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 StudentService studentService = new StudentService();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		StudentService studentService = new StudentService();
		 
		Student student = new Student();
		
		student.setUsername(request.getParameter("name"));
		student.setPhone(request.getParameter("phone"));
		
		student.setAddress(request.getParameter("address"));		
		student.setRollNumber(Integer.parseInt(request.getParameter("roll")));
		student.setPassword(request.getParameter("password")); 
	
		int count = studentService.register(student);

			if(count>0)
			{
				 response.sendRedirect("idexists.jsp");

			} else
			{
			 response.sendRedirect("login.jsp");
			}
           }
	     	}
