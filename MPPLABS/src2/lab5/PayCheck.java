package lab5;

public class PayCheck {
	
	private double grossPay;
	private double fica;
	private double medicare;
	private double SSN;
	private double local;
	private double state;
	private DateRange dayPeriod;
	private Employee employee;
	
	public PayCheck(double grossPay, double fica, double medicare, double sSN, double local, double state,
			DateRange dayPeriod, Employee employee) {
		super();
		this.grossPay = grossPay;
		this.fica = fica;
		this.medicare = medicare;
		SSN = sSN;
		this.local = local;
		this.state = state;
		this.dayPeriod = dayPeriod;
		this.employee = employee;
	}

	public void print() {
		
		System.out.println(employee.getEmpId()+" Date Range " +dayPeriod.toString()+" "+toString());
	}
	
	
	@Override
	public String toString() {
		return "PayCheck [grossPay=" + grossPay + ", fica=" + fica + ", medicare=" + medicare + ", SSN=" + SSN
				+ ", local=" + local + ", state=" + state + "]";
	}

	public double getNetPay() {
		
		return grossPay-fica-medicare-SSN-local-state;
		
	}
	
	
	

}
