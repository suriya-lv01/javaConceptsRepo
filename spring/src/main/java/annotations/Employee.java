package annotations;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Employee implements InitializingBean {

	private int empNo;
	private String empName;
	@Autowired(required = false)
	private Salary salary;

	// Any properties Autowired via a constructor need to be mandatorily defined in
	// bean xml
	@Autowired
	public Employee(int empNo,String empName) {
		this.empNo = empNo;
		this.empName=empName;

	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", salary=" + salary + "]";
	}

	// This will throw exception if all properties in constructor are not defined in
	// bean xml
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("All required properties set");

	}

}
