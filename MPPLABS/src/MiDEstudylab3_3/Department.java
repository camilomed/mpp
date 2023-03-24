package MiDEstudylab3_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Department {

	private String name;
	private String location;
	private List<Position> listPosition;
	
	public Department(String name, String location) {
		super();
		this.name = name;
		this.location = location;
		this.listPosition = new ArrayList<Position>();
	}

	public void addPosition(Position p) {
		listPosition.add(p);
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



	public List<Position> getListPosition() {
		return listPosition;
	}



	public void setListPosition(List<Position> listPosition) {
		this.listPosition = listPosition;
	}



	public  void print() {
		
		System.out.println(toString());
		System.out.println("list position");
		for(Position p: listPosition) {
			p.print();
		}
	}

	@Override
	public String toString() {
		return "Department [name=" + name + ", location=" + location + "]";
	}
	
	
	public void printReportingHierarchy() {
		//get dept head and print him & his department's position(pass to position obj's hierarchy 
		for(Position p : listPosition) {
			if(p.getManager() != null && p.getManager() == getDepartmentHead()) {
				System.out.printf("%s", "    ");
				p.print();
				p.printDownLine();
			}
		}
	}
	public Position getDepartmentHead() {
		Position rtnPos = null;
		//1. get Dept head from posList
		// - if position isManager - check his Manager exists & his dept equal to current dept
		// - not equals means he has to report to another dept - and he is the head
		
		for(Position p: listPosition) {
			if(p.isManager()) {	
				if(p.getManager() != null) {
					if(!p.getManager().getDepartment().equals(this))					
						rtnPos = p;
				}
				
			}
		}	
		return rtnPos;
	}
	public boolean equals(Object o){
		if(o==null) return false;
		if(o.getClass() != this.getClass()) {
			return false;
		}
		Department d = (Department) o;
		return (d.getName().equals(name)&& 
				d.getLocation().equals(location) &&
				d.getListPosition().equals(listPosition));
	}
	@Override
	public int hashCode() {
		return Objects.hash(name,location,listPosition);
	}
	public double getSalary() {
		double sumSalary = 0.0;
		for(int i = 0; i <listPosition.size(); i++) {
			sumSalary += listPosition.get(i).getSalary();
		}
		return sumSalary;
	}
}
