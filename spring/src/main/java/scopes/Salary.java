package scopes;

public class Salary {

	private int baseSalary;
	private int allowance;
	
	public int getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}
	public int getAllowance() {
		return allowance;
	}
	public void setAllowance(int allowance) {
		this.allowance = allowance;
	}
	
	@Override
	public String toString() {
		return "Salary [baseSalary=" + baseSalary + ", allowance=" + allowance + "]";
	}
	
	
}
