package lab3_level3;

import java.util.ArrayList;
import java.util.List;

public class Department {
	
	private String name;
	private String location;
	 private Position departmentHead;
	public Department(String name, String location, Position departmentHead) {
		super();
		this.name = name;
		this.location = location;
		 this.departmentHead = departmentHead;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	   public Position getDepartmentHead() {
	        return departmentHead;
	    }

	    public void setDepartmentHead(Position departmentHead) {
	        this.departmentHead = departmentHead;
	    }
	    
	    
	    public void printReportingHierarchy() {
	        Position topPosition = departmentHead;
	        while (topPosition.getSuperior() != null) {
	            topPosition = topPosition.getSuperior();
	        }
	        System.out.println(topPosition);
	        topPosition.printDownLine("  ");
	    }
//	public void print() {
//		System.out.println("----------------------------------------------------------------");
//		System.out.println(toString());
//		if (listPositions!=null) {
//	for ( Position pos : listPositions) {
//		pos.print();
//	}
//		}
//	}
	@Override
	public String toString() {
		return "Department [name=" + name + ", location=" + location +"]";
	}
	
	
//	public double getSalary() {
//		double salary=0;
//		for ( Position pos : listPositions) {
//			salary+=pos.getSalary();
//		}
//		return salary;
//	}

}
