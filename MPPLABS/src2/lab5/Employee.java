package lab5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
	
	private int empId;
	private List<PayCheck> listPayCheck;
	

	public Employee(int empId) {
		super();
		this.empId = empId;
		this.listPayCheck = new ArrayList<>();
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	
	public void print() {
		System.out.println("EmpId "+ empId+" listPayCheck ");
		for (PayCheck payCheck : listPayCheck) {
			payCheck.print();
		}
	}
	public PayCheck calcCompensation(int month,int year) {
		
		  LocalDate date1 = LocalDate.of(year, month, 1);
		  LocalDate date2 = LocalDate.of(year, month+1, 1);
	        DateRange payPeriod = new DateRange(date1, date2);
	        double grossPay = calcGrossPay(payPeriod);
	        
	        double FICA = (grossPay * 0.23);
	        double state =  (grossPay * 0.05);
	        double local = (grossPay * 0.1);
	        double medicare =  (grossPay * 0.03);
	        double socialSecurity =  (grossPay * 0.075);
		
		return new PayCheck(grossPay, FICA, medicare, grossPay, local, state, payPeriod, this);
	}
	public abstract double calcGrossPay(DateRange dateRange);
	
	
	public void addPayCheck(PayCheck payChack) {
		this.listPayCheck.add(payChack);
	}

	 public void addOrder(Order order1) {};

}
