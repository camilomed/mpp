package Studylesson9_11a;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {

	public static void main(String[] args) {
		List<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));
		
		System.out.println(LambdaLibrary.NAMES_OF_EMPLOYEES.apply(emps));
//		System.out.println(
//		 emps.stream().filter(x->x.getSalary()>10000).filter(x->x.getLastName().charAt(0)>'M')
//		 .sorted(Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getLastName))
//		  .map(e -> e.getFirstName() + " " + e.getLastName())
//		  .collect(Collectors.joining(", ")));
//		
//		  System.out.println(emps.stream().filter(e -> e.getSalary() > 100000)
//				  .filter(e -> e.getLastName().charAt(0) > 'M' && e.getLastName().charAt(0) <= 'Z')
//						  .sorted(Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getLastName))
//				  .map(e -> e.getFirstName() + " " + e.getLastName())
//				  .collect(Collectors.joining(", ")));
		  

	}
	
	
	

}
