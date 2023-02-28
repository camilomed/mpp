package lab3_1;

import java.util.ArrayList;
import java.util.List;

public class Company {
	private String Name;
	private List<Department> department;
	public Company(String name) {
		super();
		Name = name;
		this.department = new ArrayList<Department>();
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public List<Department> getDepartment() {
		return department;
	}
	public void setDepartment(List<Department> department) {
		this.department = department;
	}
	
	public void addDepartment(Department dep) {
		department.add(dep);
	}
	@Override
	public String toString() {
		return "Company [Name=" + Name  + "]";
	}
	public void print () {
		System.out.println(toString());
		if ( department!=null) {
			for (Department dep : department) {
				dep.print();
			}
		}
		
	}
	
	
	

}
