package com.thr.Hibernet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@Column(name="eno")
	private int eno;
	@Column(name="ename", length = 20)
	private String ename;
	@Column(name = "sal")
	private int salary;
	
	private Certificate certi; 
	
	
	
	public Certificate getCerti() {
		return certi;
	}



	public void setCerti(Certificate certi) {
		this.certi = certi;
	}



	public Employee() {
		super();
	}



	public Employee(int eno, String ename, int salary) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
	}



	public int getEno() {
		return eno;
	}



	public void setEno(int eno) {
		this.eno = eno;
	}



	public String getEname() {
		return ename;
	}



	public void setEname(String ename) {
		this.ename = ename;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	
	
	
}
