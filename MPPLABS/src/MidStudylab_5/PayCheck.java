package MidStudylab_5;

public class PayCheck {
	private double grossPay;
	private String fica;
	private String state;
	private String local;
	private String medicare;
	private String SSN;
	private DateRange payPeriod;
	private Employee emp;
	public PayCheck(double grossPay, String fica, String state, String local, String medicare, String sSN,
			DateRange payPeriod) {
		super();
		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		SSN = sSN;
		this.payPeriod = payPeriod;
	}
	
	
	public void print() {
		
	}
	
	public double getNetPay() {
		return grossPay;
		
	}
	
	
	
	
	
	
	
	
	
	public double getGrossPay() {
		return grossPay;
	}
	public void setGrossPay(double grossPay) {
		this.grossPay = grossPay;
	}
	public String getFica() {
		return fica;
	}
	public void setFica(String fica) {
		this.fica = fica;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getMedicare() {
		return medicare;
	}
	public void setMedicare(String medicare) {
		this.medicare = medicare;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public DateRange getPayPeriod() {
		return payPeriod;
	}
	public void setPayPeriod(DateRange payPeriod) {
		this.payPeriod = payPeriod;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	
	
	
	
	
	

}
