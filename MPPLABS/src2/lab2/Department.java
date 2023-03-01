package lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
//		Staff staff=null;
//		StaffStudents staffStudents =null;
		double salary =0.0;
		for ( Person p : listPerson) {
			if(p instanceof Staff ) {
				salary += ((Staff) p).getSalary();
				
			}else if (p instanceof StaffStudents) {
				salary += ((StaffStudents) p).getSalary();
			}else if(p instanceof Faculty) {
				salary += ((Faculty) p).getSalary();
			}
			
		}
		return salary;
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
	public Person SearchByName(String facultyName) {
//		
		
		System.out.println("/////////////////////////////////////////////");
		for (Person p: listPerson) {
			if (p.getName().equals(facultyName) && p instanceof Faculty) {
				Faculty faculty = null;
				faculty = (Faculty) p;
				List<Course> courses = faculty.getListCourses();
				for (Course c : courses) {
					
					for ( Person p2 : listPerson) {
						if(p2 instanceof Student ) {
							Student student =null;
							student = (Student) p2;
							 List<Course> list2 = student.getListCourses();
							for ( Course c2 : list2) {
								if (c==c2) {
									System.out.println(p2);
								}
							}
						}
							
						}
						
					}
				
				return p;
			}
		}
		
//List<Student> listStudents= new ArrayList<Student>();
//		
//		for (Person p: listPerson) {
//			List<Course> CoursesStr = listPerson.stream().filter(n-> n.getName().equals(facultyName)).
//					filter(y -> y instanceof Faculty)
//					.map(y-> (Faculty) y).
//					map(y-> y.getListCourses()).
//					flatMap(List::stream).collect(Collectors.toList());
//			for(Course c : CoursesStr) {
//				for ( Person p2 : listPerson) {
//					if(p2 instanceof Student ) {
//						Student student =null;
//						student = (Student) p2;
//						student.getListCourses().stream().forEach((x)->{
//							if(x==c) {
//								System.out.println(p2);
//							}
//						});
//					}
//					
//				}
//			}
//				
//		}
		return null;
		
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

	public void ListEstudentsFilterByFaculty(String facultyName) {
		
		  Person f = SearchByName(facultyName);
		List<Person> list = listPerson.stream().filter(p->p.getName().equals(facultyName)).collect(Collectors.toList());
		for ( Person p : list) {
			
		}
		System.out.println(list);
		
		// TODO Auto-generated method stub
		
	}
}
