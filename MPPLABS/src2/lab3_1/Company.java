package lab3_1;

import java.util.ArrayList;
import java.util.List;

public class Company {
	private String Name;
	private List<Department> listDepartments;
	public Company(String name) {
		super();
		Name = name;
		this.listDepartments = new ArrayList<Department>();
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public List<Department> getDepartment() {
		return listDepartments;
	}
	public void setDepartment(List<Department> listDepartments) {
		this.listDepartments = listDepartments;
	}
	
	public void addDepartment(Department dep) {
		listDepartments.add(dep);
	}
	@Override
	public String toString() {
		return "Company [Name=" + Name  + "]";
	}
	public void print () {
		System.out.println(toString());
		if ( listDepartments!=null) {
			for (Department dep : listDepartments) {
				dep.print();
			}
		}
		
	}
	
	public double getSalary() {
		double salary=0;
		for ( Department dep : listDepartments) {
			salary+=dep.getSalary();
		}
		return salary;
	}
	
	
	

}
