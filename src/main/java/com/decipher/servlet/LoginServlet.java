package com.decipher.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.decipher.service.StudentService;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
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
		
		StudentService studentService = new StudentService();
	
				String name = request.getParameter("name");        
				 String password = request.getParameter("password");
				 
				 HttpSession session = request.getSession();
				 
        int checkLogin = studentService.checkLogin(name, password);
       
        if(checkLogin == 1) 
        {	
			 session.setAttribute("name", name);
    		 response.sendRedirect("studentdisplayy");

        } else if(checkLogin == 2)
          {
        	 session.setAttribute("name", name);
    		 response.sendRedirect("display");
        }
        else {
			 response.sendRedirect("invalidlogin.jsp");
             }
	         }
	    	}