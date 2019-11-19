package com.decipher.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import com.decipher.model.Student;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

public class StudentDao {
	Connection connObj = new Connection();
    DBCollection collection = connObj.getCollection();
	
	public void register(Student student)
	 {
        BasicDBObject document = new BasicDBObject();
    
        document.put("Username", student.getUsername());
    	document.put("Address", student.getAddress());
    	document.put("Roll",student.getRollNumber());
    	document.put("Phone",student.getPhone());
    	document.put("Password",student.getPassword());
    
        document.put("Usertype","User");
        
       // document.put( "vill_dost" ,"saurbh");
    	
    	collection.insert(document);	       	  
	       }
			
	public int findStudentCount(int roll) 
	{	
		DBObject query = new BasicDBObject("Roll", roll);
		return collection.find(query).count();
	   }
				
	public int findStudentName(String name) 
	{	
		DBObject query = new BasicDBObject("Username", name);
		return collection.find(query).count();
	   }

	public void addSubject(String name, String subject, String mark)
	{
             DBObject query = new BasicDBObject("Username", name);	
             BasicDBObject document = new BasicDBObject();
              document.put(subject, mark);
              
		/* collection.update(query, document); */
                       
		  BasicDBObject update = new BasicDBObject(); 
		  update.put("$set", document);
		  collection.update(query, update);		 
         	}	
	
	public ArrayList<Student> findStudents(String name) 
	{	
		DBCursor cursor = collection.find();
						
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		while (cursor.hasNext()) 
		{			
			DBObject stdDBObject = cursor.next();	 
			  Student student = new Student();					  
			/*
			 * ArrayList<String> myself = new ArrayList<String>();
			 * myself.add(stdDBObject.get("Username").toString());
			 */  		
			  student.setUsername(stdDBObject.get("Username").toString());
			  student.setAddress(stdDBObject.get("Address").toString());
			  student.setRollNumber(Integer.parseInt(stdDBObject.get("Roll").toString()));
			  student.setPhone(stdDBObject.get("Phone").toString());
			/*
			 * student.setPassword(stdDBObject.get("Password").toString());
			 */			  
			  if(stdDBObject.get("Usertype").toString().equals("User"))  // here only admin remove kiya he
			  {
			  studentList.add(student);	
				/* System.out.println(studentList); */
		       }
	      }
		return studentList;		
	    }	
		public int checkLogin(String name, String password)
	        {	
//			db.getCollection('employee').find({$and:[{Username:"fgdfg"},{Password:"yogesh"}]})	
			
			BasicDBObject andQuery = new BasicDBObject();
		
			//DBObject andQuery = new BasicDBObject(); right
			
			List<BasicDBObject> obj = new ArrayList<BasicDBObject>();			
		/*
		 * BasicDBObject pr = new BasicDBObject("Username",name); obj.add(pr);
		 * System.out.println(pr+"this is he");
		 */		
			obj.add(new BasicDBObject("Username", name));
			obj.add(new BasicDBObject("Password", password));
			
		/* System.out.println(obj+"12345 hain"); */
			
//			System.out.println(obj);//[{ "Username" : "aksh"}, { "Password" : "11111"}]
			
			andQuery.put("$and", obj);			
		/*
		 * System.out.println(andQuery.toString()); System.out.println("   ");
		 */
			DBCursor cursor = collection.find(andQuery);
			
			int rowCount = cursor.count();
			//collection.find(andQuery).count()
		
			if(rowCount > 0)
			{		
				while (cursor.hasNext()) 
				 {
					DBObject empDBObject = cursor.next();	 
					String userType = empDBObject.get("Usertype").toString();
	
//				System.out.println(userType);
					
					if(userType.equals("User")) 
					{
						return 2; //user is student
					}
					else 
					{
					return 1; //user is Admin
					}
			    }
			}
			return 0; //no user exists		
		  }		
		
		public HashMap<String,String> findSubject(String name) 														
		{
			DBObject query = new BasicDBObject("Username", name);
			DBCursor cursor = collection.find(query);
						
			HashMap<String,String> subjectScore = new HashMap<String,String>();
			
			while (cursor.hasNext()) 
			{
				DBObject objj = cursor.next();
				
				Set<String> keys = objj.keySet();
			
				 ArrayList<String> keysList = new ArrayList<String>();				
				
				 for(String key : keys) 
				 {
					 keysList.add(key);	
					 
				/* System.out.println(keysList); */
				
				 }
			 for(int i=3 ; i< keysList.size(); i++)
			 {
			 System.out.println(keysList.get(i));
			
			 subjectScore.put(keysList.get(i),objj.get(keysList.get(i)).toString());
				 }			
		      }
			return subjectScore;		
		}		
      }
