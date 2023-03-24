package lab5;

import java.time.LocalDate;

public class Salaried extends Employee{
	private double salary;

	public Salaried(int empId, double salary) {
		super(empId);
		this.salary = salary;
	}

	@Override
	public double calcGrossPay(DateRange dateRange) {
		// TODO Auto-generated method stub
		return salary;
	}
	
	

}
