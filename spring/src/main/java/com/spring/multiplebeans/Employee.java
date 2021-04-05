package com.spring.multiplebeans;

public class Employee {
	private String empName;
	private String designation;
	private Salary salary;
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Salary getSalary() {
		return salary;
	}
	public void setSalary(Salary salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", designation=" + designation + ", salary=" + salary + "]";
	}
	
	

}
