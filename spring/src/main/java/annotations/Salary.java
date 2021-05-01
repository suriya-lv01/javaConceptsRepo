package annotations;

public class Salary {
	
	private int baseSalary;
	private int allowances;
	
	public int getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}
	public int getAllowances() {
		return allowances;
	}
	public void setAllowances(int allowances) {
		this.allowances = allowances;
	}
	
	@Override
	public String toString() {
		return "Salary [baseSalary=" + baseSalary + ", allowances=" + allowances + "]";
	}
	

}
