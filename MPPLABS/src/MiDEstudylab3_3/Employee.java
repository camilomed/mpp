package MiDEstudylab3_3;

public class Employee {
	
	
	private String id;
	private String  firstName;
	private String  lastName;
	private String  birdth;
	private String SSN;
	private double salary;
	
	public  void print() {
		
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", birdth=" + birdth
				+ ", SSN=" + SSN + ", salary=" + salary + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirdth() {
		return birdth;
	}

	public void setBirdth(String birdth) {
		this.birdth = birdth;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	

}
