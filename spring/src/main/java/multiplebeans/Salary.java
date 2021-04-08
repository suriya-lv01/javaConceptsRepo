package multiplebeans;

public class Salary {
	
	private String basePay;
	private String allowances;
	private String netPay;
	
	public String getBasePay() {
		return basePay;
	}
	public void setBasePay(String basePay) {
		this.basePay = basePay;
	}
	public String getAllowances() {
		return allowances;
	}
	public void setAllowances(String allowances) {
		this.allowances = allowances;
	}
	public String getNetPay() {
		return netPay;
	}
	public void setNetPay(String netPay) {
		this.netPay = netPay;
	}
	@Override
	public String toString() {
		return "Salary [basePay=" + basePay + ", allowances=" + allowances + ", netPay=" + netPay + "]";
	}
	
	

}
