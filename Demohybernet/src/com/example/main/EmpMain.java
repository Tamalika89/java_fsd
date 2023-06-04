package com.example.main;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import com.example.pojo.Employee;


public class EmpMain {
public static void main(String[] args) {
	//SSR is used to map the config file and execute it .
	StandardServiceRegistry  ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();	
	//Metadata of the xml file is read by this object
	Metadata md=new MetadataSources(ssr).getMetadataBuilder().build();
	//session-factory- db
	SessionFactory sf=md.getSessionFactoryBuilder().build();
	//all the crud operations need to be done in Session 
	Session s=sf.openSession();
	//Transaction- perform sql operations and commit it permenantly on the db
	Transaction t=s.beginTransaction();
	Scanner sc=new Scanner(System.in);
//	System.out.println("enter the eid");
//	e.setEid1(sc.nextInt());
//	System.out.println("enter the ename");
//	e.setEmpname(sc.next());
//	System.out.println("enter the email");
//	e.setEmpemail(sc.next());
//	System.out.println("enter the salary");
//	e.setSalary(sc.nextDouble());
//	s.saveOrUpdate(e);  // Automatically insert the value no need to write the code manually
	//s.delete(e);
//	Employee e1=s.get(Employee.class,1);
//	System.out.println(e1);
	//insertion
//	for(int i=2;i<10;i++) {
//		Employee e=new Employee();
//		e.setEid1(i);
//		e.setEmpname("name"+i);
//		e.setEmpemail("email"+i+"aba@gmail.com");
//		e.setSalary(i*1000);
//		s.save(e);
//	}
	//HQL 
	//select *from employee
//	Query q=s.createQuery("from Employee where salary=2000");
//	Employee e=(Employee) q.uniqueResult();
//	System.out.println(e);
	Query q=s.createQuery("select empname,empmail from Employee where salary=2000");
	Object[] emp=(Object[]) q.uniqueResult();
	System.out.println(emp[0]+""+emp[1]);
	


	t.commit();
	s.close();
	sf.close();
	

}
}
