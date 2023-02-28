package lab3_1;

import java.util.ArrayList;
import java.util.List;

public class Department {
	
	private String name;
	private String location;
	private List<Position> position;
	public Department(String name, String location) {
		super();
		this.name = name;
		this.location = location;
		this.position = new ArrayList<Position>();
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
	public List<Position> getPosition() {
		return position;
	}
	public void setPosition(List<Position> position) {
		this.position = position;
	}
	
	public void addDPosition(Position pos) {
		position.add(pos);
	}
	
	public void print() {
		System.out.println("----------------------------------------------------------------");
		System.out.println(toString());
		if (position!=null) {
	for ( Position pos : position) {
		pos.print();
	}
		}
	}
	@Override
	public String toString() {
		return "Department [name=" + name + ", location=" + location +"]";
	}
	
	
	

}
