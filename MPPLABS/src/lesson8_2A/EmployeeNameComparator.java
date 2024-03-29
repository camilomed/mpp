package lesson8_2A;

import java.util.Comparator;

/* A functor, but not a closure */
public class EmployeeNameComparator implements Comparator<Employee> {
	
	EmployeeSalaryComparator empSalary = new EmployeeSalaryComparator();
	@Override
	public int compare(Employee e1, Employee e2) {
		if (e1.equals(e2)) return 0;
		else if(e1.name.compareTo(e2.name)==1 || (e1.name.compareTo(e2.name)==0 && empSalary.compare(e1, e2)==1)) return 1;
		return -1;
	}
}
