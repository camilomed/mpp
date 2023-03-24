package MiDEstudylab3_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Position {

	
	private String title;
	private String description;
	private Employee Emp;
	private List<Position> listIinferior= new ArrayList<Position>();
	private Position manager;
	private Department department;
	
	
	
	


	public Position(String title, String description, Employee emp, Position manager) {
		super();
		this.title = title;
		this.description = description;
		Emp = emp;
		this.manager = manager;
	}




	public Position(String title, String description, Employee emp, Position manager, Department department) {
		super();
		this.title = title;
		this.description = description;
		Emp = emp;
		this.manager = manager;
		this.department = department;
	}




	public String getTitle() {
		return title;
	}




	public void setTitle(String title) {
		this.title = title;
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	public Employee getEmp() {
		return Emp;
	}




	public void setEmp(Employee emp) {
		Emp = emp;
	}








	public List<Position> getListIinferior() {
		return listIinferior;
	}




	public void setListIinferior(List<Position> listIinferior) {
		this.listIinferior = listIinferior;
	}




	public Position getManager() {
		return manager;
	}




	public void setManager(Position manager) {
		this.manager = manager;
	}




	public Department getDepartment() {
		return department;
	}




	public void setDepartment(Department department) {
		this.department = department;
	}

	public void addlistIinferior(ArrayList<Position> pList) {
		listIinferior = pList;
		
	}



	public void print() {
		System.out.println(toString());
		Emp.print();
	}


	public double getSalary() {
		return (Emp != null ? Emp.getSalary() : 0);	
	}
	public void printDownLine() {
		if(listIinferior != null && listIinferior.size()!=0) {
			for(Position p : listIinferior) {
				System.out.printf("%s", "     ");
				p.Emp.print();
			}
		}	
	}
	public boolean isManager() {//means it has inferior list
		if(listIinferior != null && listIinferior.size()!=0) return true;
		else return false;		
	}
	
	@Override
	public boolean equals(Object p) {
		if(p == null) return false;
		if(! (p instanceof Position)) return false;
		Position pos = (Position) p;
		return pos.title.equals(this.title)
				&& pos.description.equals(this.description);				
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(title, description);
	}

	@Override
	public String toString() {
		return "Position [title=" + title + ", description=" + description + "]";
	}
	
	
}
