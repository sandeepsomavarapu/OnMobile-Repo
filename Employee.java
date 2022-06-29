package com.onmobile.serialization;

import java.io.Serializable;

public class Employee implements Serializable {

	private int empid;
	private String empName;
	private int empSal;
	public Employee(int empid, String empName, int empSal) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empSal = empSal;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
	
}
