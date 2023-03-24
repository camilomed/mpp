package lab7_lvl4;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

	private double gpa;
	private List<Course> listCourses;
	public Student(String name, String phone, int age,double gpa) {
		super(name, phone, age);
		this.gpa= gpa;
		this.listCourses = new ArrayList<Course>();
		
	}


	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
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

	

}
