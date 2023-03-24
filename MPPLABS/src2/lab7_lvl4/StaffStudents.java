package lab7_lvl4;

public class StaffStudents extends Student{

	private double salary;
	private Staff staff;
	
	
	public StaffStudents(String name, String phone, int age, double gpa,double salary) {
		super(name, phone, age, gpa);
		this.salary = salary;
		this.staff = new Staff(name, phone, age, salary);
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	
	
	
	
}
