package labStreamlvl3_6;

import java.util.ArrayList;
import java.util.List;

import lesson7_3.ForEachExample;

public class Position {
	
	private String title;
	private TypePosition typePosition;
	private String description;
	private Employee employee;
	private Position superior;
	private List<Position> inferior;
	
	
	public Position( TypePosition typePosition, String description, Employee employee) {
		super();
		this.typePosition = typePosition;
		this.description = description;
		this.employee = employee;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	public TypePosition getTypePosition() {
		return typePosition;
	}
	public void setTypePosition(TypePosition typePosition) {
		this.typePosition = typePosition;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public void print() {
		System.out.println(toString());
	}


	@Override
	public String toString() {
		return " [typePosition=" + typePosition + ", description=" + description + ", employee=" + employee
				+ "]";
	}
	public double getSalary() {
		double salary=0;
			salary+= this.employee.getSalary();
		
		return salary;
		
	}
	
	public void changePosition() {
		
		
	}
	
	
	

}
