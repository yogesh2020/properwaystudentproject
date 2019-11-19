package com.decipher.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.decipher.dao.StudentDao;
import com.decipher.model.Student;

public class StudentService {
	
	StudentDao studentDao = new StudentDao();   //private
	
	public int register(Student student)
	{
		int countRoll = studentDao.findStudentCount(student.getRollNumber());
		int countName = studentDao.findStudentName(student.getUsername());
		
		System.out.println(countRoll + "  " + countName);

		if(countRoll == 0 && countName == 0) 
		{
			studentDao.register(student);
			return countRoll;
		}
		return 1;
	}
	
	public int checkLogin(String name, String password)
	{
		return studentDao.checkLogin(name,password);
	}
	
	public ArrayList<Student> Studentdisplay(String name)
	{		
		return studentDao.findStudents(name);
	}	
	
	public void addSubject(String name, String subject, String mark) 
	{	
studentDao.addSubject(name, subject, mark);	
	}

	public HashMap<String,String> display(String name)
	{		
		return studentDao.findSubject(name);
	}
	
		 }
