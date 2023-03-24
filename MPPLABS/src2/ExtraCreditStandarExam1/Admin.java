package ExtraCreditStandarExam1;

import java.util.ArrayList;
import java.util.List;

public class Admin {

	private   List<Employee> listEmployee= new ArrayList<>();;
	

	public Admin(List<Employee> listEmployee) {
		super();
		this.listEmployee = listEmployee;
	}

	public static  double computeUpdatedBalanceSum(List<Employee> list) {
		//implement
		double total = 0;
		for ( Employee employee : list) {
		total=	employee.computeUpdatedBalanceSum();
		}
		return total;
	}
	
}
