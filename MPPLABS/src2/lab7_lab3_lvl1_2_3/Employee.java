package lab7_lab3_lvl1_2_3;

import java.util.Date;
import java.util.Objects;

public class Employee  implements Cloneable{
	private int employeeId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String SSN;
	private Date birthDate;
	private double salary;
	public Employee(int employeeId, String firstName, String middleName, String lastName, String sSN, Date birthDate,
			double salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.SSN = sSN;
		this.birthDate = birthDate;
		this.salary = salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void print() {
		System.out.println(toString());
		
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", SSN=" + SSN + ", birthDate=" + birthDate + ", salary=" + salary + "]";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(employeeId, firstName, middleName, lastName, SSN, salary, birthDate);
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj == null ) return false;
				if( !(obj instanceof Employee)) return false;
				
				Employee emp = (Employee) obj;
		// TODO Auto-generated method stub
		return emp.employeeId==this.employeeId
				&& emp.firstName.equals(this.firstName) 
				&& emp.middleName.equals(this.middleName) 
				&& emp.lastName.equals(this.lastName)
				&& emp.birthDate.equals(this.birthDate)
				&& emp.SSN.equals(this.SSN)
				&& emp.salary == this.salary;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Employee copy = (Employee) super.clone();
		return copy;
	}
	
	
	
	

}
