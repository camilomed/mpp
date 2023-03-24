package MiDEstudylab3_3;

import java.util.ArrayList;
import java.util.List;

public class Company {
	
	private String name ; 
	private List<Department> listDepartment;
	
	
	
	public Company(String name) {
		super();
		this.name = name;
		this.listDepartment = new ArrayList<Department>();
	}

	public void addDepartment(Department d) {
		listDepartment.add(d);
	}

	public  void print() {
		
		System.out.println(toString());
		System.out.println("list department");
		for (Department d: listDepartment) {
			d.print();
		}
	}


	@Override
	public String toString() {
		return "Company [name=" + name + "]";
	}
	
	public double getSalary() {
		double sumSalary = 0.0;		
		for(int i = 0; i <listDepartment.size(); i++) {
			sumSalary += listDepartment.get(i).getSalary();
		}
		System.out.printf("%s", "Total Salary of " + name + " Company is " + sumSalary);
		return sumSalary;
	}
	
	public void printReportingHierarchy() {
		//1.getTopExecutive
		Position posTopExe = getTopExecutive();		
		posTopExe.print();
		
		//2.getDeptHead
		//3.print that department hierarchy
		for(Department d: listDepartment) {
			Position dHead = d.getDepartmentHead();
			if(dHead!= null) {
				System.out.printf("%s", "  ");
				dHead.print();		
			}
			d.printReportingHierarchy();
		}
		

	}
	public Position getTopExecutive() {
		//topExec Position is inside department "Top"
		List<Position> newPosList = new ArrayList<Position>();		
		
		for(Department dp: listDepartment) {
			if(dp.getName().equals("Top")) {
				newPosList = dp.getListPosition();
			}
		}		
		//assume only one top executive in company
		return newPosList.get(0);
	}

}
