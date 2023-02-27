package lab2;

public class StaffStudents extends Person{

	private double gpa;
	private double salary;
	public StaffStudents(String name, String phone, int age, double gpa, double salary) {
		super(name, phone, age);
		this.gpa = gpa;
		this.salary = salary;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
