package lesso7b;

public class Employee {
	private String name;
	private int salary;
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override 
	public String toString() {
		return "(" + name + ", " + salary + ")";
	}
	
	public boolean equals(Employee e) {
		return e.name.equals(name) && e.salary == salary;
	}
	
	@Override
	public boolean equals(Object comp) {
		if (this == comp) return true;
		
		
		if (comp == null)	return false;
		
		
		if (getClass() != comp.getClass())return false;
		
		
		Employee emp = (Employee) comp;
		if (name == null) {
			if (emp.name != null)
				return false;
		} else if (!name.equals(emp.name))
			return false;
		if (salary != emp.salary)
			return false;
		return true;
	}
}
