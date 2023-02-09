package finalTestEstudy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class employeeInfo  {
	
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		
		Employee emp1 = new Employee("juan", "bolañoz", 1000);
		Employee emp2 = new Employee("pedro", "Antonio", 1500);
		emps.add(emp1);
		emps.add(emp2);
		Collections.sort(emps,new EmployeeComp());
	}


}
