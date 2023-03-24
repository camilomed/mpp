package labStreamlvl3_6;

import java.util.ArrayList;
import java.util.List;

public class Department {
	
	private String name;
	private String location;
	private List<Position> listPositions;
	public Department(String name, String location) {
		super();
		this.name = name;
		this.location = location;
		this.listPositions = new ArrayList<Position>();
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
	public List<Position> getlistPositions() {
		return listPositions;
	}
	public void setlistPositions(List<Position> listPositions) {
		this.listPositions = listPositions;
	}
	
	public void addPosition(Position pos) {
		listPositions.add(pos);
	}
	
	public void print() {
		listPositions.stream().forEach(pos->{
			System.out.println(toString());
			pos.print();
			
		});
//		System.out.println("----------------------------------------------------------------");
//		System.out.println(toString());
//		if (listPositions!=null) {
//	for ( Position pos : listPositions) {
//		pos.print();
//	}
//		}
	}
	@Override
	public String toString() {
		return "Department [name=" + name + ", location=" + location +"]";
	}
	
	
	public double getSalary() {
		
		return
	listPositions.stream().mapToDouble(Position::getSalary).reduce(0,(x,y)->x=x+y);
//		double salary=0;
//		for ( Position pos : listPositions) {
//			salary+=pos.getSalary();
//		}
	}

}
