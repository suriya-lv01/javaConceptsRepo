package lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean {
	
	private int empNo;
	private String empName;
	
	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("Default Employee constructor called");
	}
	
	public Employee(int empNo) {
		// TODO Auto-generated constructor stub
		System.out.println("Employee(int empNo) constructor called");
		this.empNo=empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterPropertiesSet method called");

	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy method called");

	}
	
	public void initmethod() throws Exception{
		// TODO Auto-generated method stub
		System.out.println("initmethod called");

	}

	public void destroymethod() throws Exception{
		// TODO Auto-generated method stub
		System.out.println("destroymethod called");

	}

}
