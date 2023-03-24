package MidStudylab_5;

public class Hourly extends Employee {

	private double hourlyWage;
	private double hoursPerWeek;
	
	
	public Hourly(String empId, double hourlyWage, double hoursPerWeek) {
		super(empId);
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}


	@Override
	public double calcGrossPay(DateRange date) {
		// TODO Auto-generated method stub
		return hoursPerWeek*hourlyWage*4;
	}


	public double getHourlyWage() {
		return hourlyWage;
	}


	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}


	public double getHoursPerWeek() {
		return hoursPerWeek;
	}


	public void setHoursPerWeek(double hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}
	
	
	
	
}
