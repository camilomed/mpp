package lab2;

public class Student extends Person {

	private double gpa;
	public Student(String name, String phone, int age,double gpa) {
		super(name, phone, age);
		this.gpa= gpa;
		
	}


	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	

}
