package lab3_1;

import java.util.ArrayList;
import java.util.List;

public class Position {
	
	private String title;
	private String description;
	private List<Employee> listEmployees;
	public Position(String title, String description) {
		super();
		this.title = title;
		this.description = description;
		this.listEmployees = new ArrayList<Employee>();
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
	public List<Employee> getListEmployees() {
		return listEmployees;
	}
	public void setListEmployees(List<Employee> listEmployees) {
		this.listEmployees = listEmployees;
	}
	public void addEmployee(Employee emp) {
		listEmployees.add(emp);
	}
	
	public void print() {
		System.out.println("*******************************");
		System.out.println(toString());
		if (listEmployees!= null) {
			for(Employee emp : listEmployees) {
				emp.print();
			}
		}
		
	}
	@Override
	public String toString() {
		return "Position [title=" + title + ", description=" + description + ", listEmployees=" + listEmployees + "]";
	}
	
	
	
	
	

}
