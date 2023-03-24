package ExtraCreditStandartExamApril2017;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeAdmin {
	
	// returns a list of social security numbers, sorted in ascending order,
		// that belong to an Employee in the input table but that are not on the
		// socSecNums input list
		public static List<String> prepareSsnReport(HashMap<String, Employee> table, List<String> socSecNums) {
//			List<Employee> employees = new ArrayList<Employee>();
//		 socSecNums.stream().forEach(x-> {
//			 if(
//			! table.containsKey(x)) {
//				 System.out.println("hola");
//				employees.add(table.get(x));
//			 }
//			});;
			return 
			table.keySet().stream().filter(x->!(socSecNums.contains(x))).sorted(). collect(Collectors.toList());
//			employees.stream().sorted(Comparator.comparingInt(e-> Integer.parseInt( e.getSsn()))).map(Employee::toString).collect(Collectors.toList());
			//implement
					
		}			
			//return a list of Employees whose social security number is on the input list socSecNums
					//and whose salary is >80000; the return list does not need to be sorted  
		public static List<Employee> prepareEmpReport(HashMap<String, Employee> table, List<String> socSecNums) {
			//implement
			
			return 
			table.values().stream().filter(x->socSecNums.contains(x.getSsn()))
			.filter(x->x.getSalary()>80000).collect(Collectors.toList());
		}

}
