package finalTestEstudy;

import java.util.Comparator;

public class EmployeeComp  implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.firstName.compareTo(o2.firstName);
	}

}
