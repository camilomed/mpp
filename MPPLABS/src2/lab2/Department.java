package lab2;

import java.util.ArrayList;
import java.util.List;

public class Department {

	
	private String name;
	
	private List<Person> listPerson;
	
	

	public Department(String name) {
		super();
		this.name = name;
		this.listPerson = new ArrayList<Person>();
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public double getTotalSalary() {
		return 0;
	}
	public void ShowAllMembers() {
		
	}
	public int UnitsPerFaculty() {
		return 0;
	}

	public void addPerson(Person person) {
		
		listPerson.add(person);
		// TODO Auto-generated method stub
		
	}

	public void showAllMembers() {
		// TODO Auto-generated method stub
//		System.out.println("name : "+ );
		listPerson.stream().forEach( p-> System.out.println(p.toString()+"Type: "+p.getClass().getSimpleName()));
	}

	public void unitsPerFaculty() {
		Faculty faculty = null;
		for(Person p : listPerson) {	
			if(p instanceof Faculty) {
				faculty = (Faculty) p;
				System.out.println("Type : " + p.getClass().getSimpleName());
				System.out.println(" Unit Per Faculty "+ faculty.getTotalUnits());
			}
		}
	}
	public void printByType() {
		System.out.println("******************************************");
		System.out.println("Faculty in Computer Science");
		System.out.println("Name           "+ "Phone  "+" Age   "+"Salary");
		listPerson.stream().filter(p->p.getClass().getSimpleName().equals("Faculty")).map(p-> (Faculty) p).
		forEach(( p)-> System.out.println(p.getName()+"   "+p.getPhone()+"   "+p.getAge()+"   "+p.getSalary()));
		System.out.println();
		System.out.println("******************************************");
		System.out.println("Student in Computer Science");
		System.out.println("Name           "+ "Phone  "+" Age   "+"Gpa");
		listPerson.stream().filter(p->p.getClass().getSimpleName().equals("Student")).map(p-> (Student) p).
		forEach(( p)-> System.out.println(p.getName()+"   "+p.getPhone()+"   "+p.getAge()+"   "+p.getGpa()));
		System.out.println();
		System.out.println("******************************************");
		System.out.println("Staff in Computer Science");
		System.out.println("Name           "+ "Phone  "+" Age   "+"Salary");
		listPerson.stream().filter(p->p.getClass().getSimpleName().equals("Staff")).map(p-> (Staff) p).
		forEach(( p)-> System.out.println(p.getName()+"   "+p.getPhone()+"   "+p.getAge()+"   "+p.getSalary()));
	}
}
