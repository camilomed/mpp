package lesson8_2BC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;

public class EmployeeInfo {
	static enum SortMethod {BYNAME, BYSALARY};
	
	public void sort(List<Employee> emps, final SortMethod method) {
		
		Collections.sort(emps, (e1,e2)->{
			if(method==SortMethod.BYNAME) {
				if(e1.name.equals(e2)) return 0;
				if(e1.name.compareTo(e2.name)>1 || (e1.name.compareTo(e2.name)==0 && e1.salary>e2.salary)) return 1;
			}
			return -1;
		});
		
	}
//		class EmployeeComparator {
//			@Override
//			public int compare(Employee e1, Employee e2) {
//				if(method == SortMethod.BYNAME) {
//					if(e1.equals(e2)) return 0;
//					else if(e1.name.compareTo(e2.name) == 1 || 
//							(e1.name.compareTo(e2.name) == 0 && e1.salary > e2.salary)) return 1;
//					else return -1;
//				} else {
//					if(e1.equals(e2)) return 0;
//					else if(e1.salary > e2.salary || 
//							(e1.salary == e2.salary && e1.name.compareTo(e2.name) == 1)) return 1;
//					else return -1;
//				}
//			}
//		}
//		Collections.sort(emps, new EmployeeComparator());
//	}
	// Part C
//	public void sort(List<Employee> emps,  SortMethod method) {	
//
//		Collections.sort(emps, (e1,e2) ->
//		{
//			if(method == SortMethod.BYNAME) {
//				if(e1.equals(e2)) return 0;
//				else if(e1.name.compareTo(e2.name) == 1 || 
//						(e1.name.compareTo(e2.name) == 0 && e1.salary > e2.salary)) return 1;
//				else return -1;
//			} else {
//				if(e1.equals(e2)) return 0;
//				else if(e1.salary > e2.salary || 
//						(e1.salary == e2.salary && e1.name.compareTo(e2.name) == 1)) return 1;
//				else return -1;
//			}
//		});			
//	}
	
	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Double> biF = (x,y)-> Math.pow(x, y);
		biF.apply(2, 3);
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Andy", 60000));
		EmployeeInfo ei = new EmployeeInfo();
		ei.sort(emps, EmployeeInfo.SortMethod.BYNAME);
		System.out.println(emps);
		//same instance
		ei.sort(emps, EmployeeInfo.SortMethod.BYSALARY);
		System.out.println(emps);
	}
}
