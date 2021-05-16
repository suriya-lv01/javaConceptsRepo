package autowiring_draft;

public class Salary {
	
	private int totalSalary;

	public int getTotalSalary() {
		return totalSalary;
	}

	public void setTotalSalary(int totalSalary) {
		this.totalSalary = totalSalary;
	}

	@Override
	public String toString() {
		return "Salary [totalSalary=" + totalSalary + "]";
	}
	
	

}
