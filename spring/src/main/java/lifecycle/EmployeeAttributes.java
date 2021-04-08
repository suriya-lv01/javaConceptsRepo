package lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class EmployeeAttributes {

	private int empNo;
	private String empName;

	public EmployeeAttributes() {
		// TODO Auto-generated constructor stub
		System.out.println("Default EmployeeAttributes constructor called");
	}

	public EmployeeAttributes(int empNo) {
		// TODO Auto-generated constructor stub
		System.out.println("EmployeeAttributes(int empNo) constructor called");
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "EmployeeAttributes [empNo=" + empNo + ", empName=" + empName + "]";
	}

	public void initmethod() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("initmethod called");

	}

	public void destroymethod() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroymethod called");

	}

}
