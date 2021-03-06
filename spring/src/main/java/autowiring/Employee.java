package autowiring;

public class Employee {

	private String empName;
	private Salary salary;
	
	public Employee() {
		System.out.println("Default Employee constructor");
	}

	public Employee(Salary salary) {
		System.out.println("Employee constructor using salary");
		this.salary = salary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", salary=" + salary + "]";
	}

}
