package com.di.collections;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {

	private String empName;
	private Properties doj;
	private Map<String,String> salaryDetails;
	private Set<String> techStack;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Properties getDoj() {
		return doj;
	}
	public void setDoj(Properties doj) {
		this.doj = doj;
	}
	public Map<String, String> getSalaryDetails() {
		return salaryDetails;
	}
	public void setSalaryDetails(Map<String, String> salaryDetails) {
		this.salaryDetails = salaryDetails;
	}
	public Set<String> getTechStack() {
		return techStack;
	}
	public void setTechStack(Set<String> techStack) {
		this.techStack = techStack;
	}
	@Override
	public String toString() {
		return "empName=" + empName + ",\n doj=" + doj + ",\n salaryDetails=" + salaryDetails + ",\n techStack="
				+ techStack ;
	}


}
