package MidStudylab_5;

public class Salaried extends Employee  {

	private double salary;

	
	public Salaried(String empId, double salary) {
		super(empId);
		this.salary = salary;
	}


	@Override
	public double calcGrossPay(DateRange date) {
		// TODO Auto-generated method stub
		return salary;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
}
