package di;

public class Employee {

	private String empName;
	private double basicpay;
	private double allowances;
	private double netpay;
	
	Employee(double allowances){		
		this.allowances=allowances;		
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getBasicpay() {
		return basicpay;
	}
	public void setBasicpay(double basicpay) {
		this.basicpay = basicpay;
	}
	
	public double getNetpay() {
		return netpay;
	}
	public void setNetpay(double netpay) {
		this.netpay = netpay;
	}
	
	public double getAllowances() {
		return allowances;
	}
	public void setAllowances(double allowances) {
		this.allowances = allowances;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", basicpay=" + basicpay + ", allowances=" + allowances + ", netpay="
				+ netpay + "]";
	}

}
