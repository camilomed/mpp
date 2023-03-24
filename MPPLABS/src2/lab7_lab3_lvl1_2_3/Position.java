package lab7_lab3_lvl1_2_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import lesson7_3.ForEachExample;

public class Position implements Cloneable {
	
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
	
	

	

			@Override
	public int hashCode() {
		return Objects.hash(title,description);
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj == null ) return false;
				if( !(obj instanceof Position)) return false;
				
		
		Position pos = (Position) obj;
		// TODO Auto-generated method stub
		return pos.title.equals(this.title)
		&& pos.description.equals(this.description);
		
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Position copy = (Position) super.clone();
		return copy;
	}


	

}
