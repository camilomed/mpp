package labStreamlvl3_6;

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
		
		listDepartments.stream().forEach(dep->{
			
			System.out.println(toString());
			dep.print();
			
		});
//		if ( listDepartments!=null) {
//			for (Department dep : listDepartments) {
//			}
//		}
		
	}
	
	public double getSalary() {
		
		return
		listDepartments.stream().mapToDouble(Department::getSalary).sum();
//		double salary=0;
//		for ( Department dep : listDepartments) {
//			salary+=dep.getSalary();
//		}
	}
	
	
	

}
