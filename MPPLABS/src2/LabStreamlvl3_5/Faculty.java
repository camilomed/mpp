package LabStreamlvl3_5;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends Person {

	
	private double salary;
	private List<Course> listCourses;

	public Faculty(String name, String phone, int age, double salary) {
		super(name, phone, age);
		this.salary = salary;
		listCourses = new ArrayList<Course>();
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public List<Course> getListCourses() {
		return listCourses;
	}

	public void setListCourses(List<Course> listCourses) {
		this.listCourses = listCourses;
	}
	
	public void addCourse(Course course) {
		this.listCourses.add(course);
	}
	
	public int getTotalUnits() {
		
	return	listCourses.stream().map(x->x.getUnits()).reduce(0,(x,y)->x=x+y);
//		for(Course c : listCourses) {
//			sum = sum + c.getUnits();
//		}
//		return sum;
	}
	
	
}
