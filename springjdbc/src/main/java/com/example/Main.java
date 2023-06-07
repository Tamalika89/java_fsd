package com.example;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
	       Student s=ac.getBean(Student.class);
	       StudentDAO dao=ac.getBean(StudentDAO.class);
	       Scanner sc=new Scanner(System.in);
	       System.out.println("enter the id value ");
	       s.setId(sc.nextInt());
	       System.out.println("enter the name value");
	       s.setName(sc.next());
	       System.out.println("enter the email value");
	       s.setEmail(sc.next());
	       int row=dao.insert(s);
	       if(row>0) {
	    	   System.out.println("inserted successfully ");
	       }
	       else {
	    	   System.out.println("insertion failed ");
	       }
	       
	       
	       List<Student> list=dao.getallstudents();
	       for(Student ss:list) {
	    	   System.out.println(ss);
	       }


	}

}
