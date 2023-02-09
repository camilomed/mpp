package finalTestEstudy;

import java.util.Comparator;

public class EmployeeCompSalary implements Comparator<Employee> {


	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		if(o1.getSalary()== o2.salary) return 0;
		else if(o1.salary<o2.salary)return -1;
		return 1;
	}

}
