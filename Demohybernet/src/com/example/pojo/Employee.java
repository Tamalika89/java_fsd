package com.example.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Employee {
	@Id
	private int eid;
	//@Column(name="ename")
	private String empname;
	private String empemail;
	private double salary;
	public int getEid() {
		return eid;
	}
	public void setEid1(int eid) {
		this.eid = eid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpemail() {
		return empemail;
	}
	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", empname=" + empname + ", empemail=" + empemail + ", salary=" + salary + "]";
	}
	public void setEid(int nextInt) {
		this.eid = eid;
		
	}
	
	
	

}
