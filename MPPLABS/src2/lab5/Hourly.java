package lab5;

import java.time.LocalDate;

public class Hourly extends Employee{

	public int hourlyWage;
	public int hourPerWeek;
	public Hourly(int empId, int hourlyWage, int hourPerWeek) {
		super(empId);
		this.hourlyWage = hourlyWage;
		this.hourPerWeek = hourPerWeek;
	}
	@Override
	public double calcGrossPay(DateRange dateRange) {
		// TODO Auto-generated method stub
		return hourlyWage*hourPerWeek*4;
	}
	
	
}
