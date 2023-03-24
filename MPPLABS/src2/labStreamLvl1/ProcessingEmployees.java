package labStreamLvl1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ProcessingEmployees
{
   public static void main(String[] args)
   {
      // initialize array of Employees
      Employee[] employees = {
         new Employee("Jason", "Red", 5000, "IT"),
         new Employee("Ashley", "Green", 7600, "IT"),
         new Employee("Matthew", "Indigo", 3587.5, "Sales"),
         new Employee("James", "Indigo", 4700.77, "Marketing"),
         new Employee("Luke", "Indigo", 6200, "IT"),
         new Employee("Jason", "Blue", 3200, "Sales"),
         new Employee("Wendy", "Brown", 4236.4, "Marketing"),
      new Employee("Wendy", "James", 4236.4, "Marketing")};
      
      List<String > words = new ArrayList<String>();
      words.add("hola");
      words.add("adios");
      words.add("hi");
      words.add("bye");
      words.add("sayonara");

      char c = 'c';
      char d = 'd';
      int len = 5;
      // get List view of the Employees
      List<Employee> list = Arrays.asList(employees);
      studyFirstLevel(list);
      studySecondLevl(words,c,d,5);
      
      
      
      
      
      ///////////////////////////////////////////////////////////////////////+
      
//      //1)
//      System.out.println("number of B "+
//      list.stream().filter(x-> x.getLastName().charAt(0)=='B').count());
//      //2)
//    		  list.stream().filter(x-> x.getLastName().charAt(0)=='B').sorted(  Comparator.comparing(Employee::getLastName)).forEach(System.out::print) ;
////    3)
////    		  A)
//    		  
//    	  list.stream().filter(x-> x.getLastName().charAt(0)=='B').sorted(  Comparator.comparing(Employee::getLastName)).
//    		  forEach(x->{
//    			  
//    			  x.getFirstName().toUpperCase() ;
//    			  x.getLastName().toUpperCase() ;
//    		  });
//    	  list.stream().filter(x-> x.getLastName().charAt(0)=='B').sorted(  Comparator.comparing(Employee::getLastName)).
//    	  forEach(x->{
//    		  x.setFirstName(
//    		  x.getFirstName().toUpperCase()) ;
//    		  x.setLastName(
//    		  x.getLastName().toUpperCase() );
//    	  });
//    	  
//    	  //4)
//    	  
//    	  list.stream().forEach(x->{
//    		  	
//    		  if(x.getLastName().charAt(0)=='B') 
//    			  x.setLastName( x.getLastName().toUpperCase());
//    		  System.out.println(x.toString());
//    		  
//    	  });
//    	  
//    	  //4.1
//    	  
//    	  list.stream().collect(Collectors.toList());
//    	  System.out.println("4.1  "+
//    	  list.stream().map(Employee::toString).collect(Collectors.joining(", ")));
//    	  
//    	  
//    	  //4.2
//    	  System.out.println("4.2  "+
//    	  list.stream().map(Employee::toString).collect(Collectors.joining("\n")));
//    	  
//    	  //5 
//    	  System.out.println("5----");
//    	  
//    	  list.stream().map(Employee::getLastName).filter(x->x.charAt(0)=='J').forEach(System.out::print);;
//    	  
//    	  //6 
//    	  System.out.println("6 -------");
//    DoubleSummaryStatistics summarazing = list.stream().map(Employee::getSalary).collect(Collectors.summarizingDouble(Double::doubleValue));
//    	  System.out.println(summarazing.getAverage());
//    	  System.out.println(summarazing);
//System.out.println("7---");
//		System.out.println(
//		list.stream().mapToDouble(Employee::getSalary).reduce(0, (x, y) -> x + y));  
//		
//		System.out.println("8---");
//		System.out.println(
//				
//				list.stream().map(Employee::getFirstName).collect(Collectors.toList()));
//		
//	IntStream even = IntStream.iterate(0, n->n+2);
//	
//	even.limit(20).forEach(System.out::print);
//	
//	proveAllMethods(list);
//		   list.stream()
//         .mapToDouble(Employee::getSalary)
//         .reduce(0, (value1, value2) -> value1 + value2));  
//    		   display all Employees
		
//      System.out.println("Complete Employee list:");
//      list.stream().forEach(System.out::println);   //A method reference.
//      
//      // Predicate (boolean-valued function) that returns true for salaries 
//      //in the range $4000-$6000
//
//      // Display Employees with salaries in the range $4000-$6000
//      // sorted into ascending order by salary
//      System.out.printf(
//         "%nEmployees earning $4000-$6000 per month sorted by salary:%n");
//
//      list.stream()
//          .filter(fourToSixThousand)
//          .sorted(Comparator.comparing(Employee::getSalary))
//          .forEach(System.out::println);
//
//      // Display first Employee with salary in the range $4000-$6000
	
//
//      // Functions for getting first and last names from an Employee
//      Function<Employee, String> byFirstName = Employee::getFirstName;
//      Function<Employee, String> byLastName = Employee::getLastName;
//
//      // Comparator for comparing Employees by first name then last name
//      Comparator<Employee> lastThenFirst = 
//         Comparator.comparing(byLastName).thenComparing(byFirstName);
//
//      // sort employees by last name, then first name 
//      System.out.printf(
//         "%nEmployees in ascending order by last name then first:%n");
//      list.stream()
//          .sorted(lastThenFirst)
//          .forEach(System.out::println);
//
//      // sort employees in descending order by last name, then first name
//      System.out.printf(
//         "%nEmployees in descending order by last name then first:%n");
//      list.stream()
//          .sorted(lastThenFirst.reversed())
//          .forEach(System.out::println);
//
//      // display unique employee last names sorted
//      System.out.printf("%nUnique employee last names:%n");
//      list.stream()
//          .map(Employee::getLastName)
//          .distinct()
//          .sorted()
//          .forEach(System.out::println);
//
//      // display only first and last names
//      System.out.printf(
//         "%nEmployee names in order by last name then first name:%n"); 
//      list.stream()
//          .sorted(lastThenFirst)
//          .map(Employee::getName)
//          .forEach(System.out::println);
//
//      // group Employees by department
//      System.out.printf("%nEmployees by department:%n"); 
//      Map<String, List<Employee>> groupedByDepartment =
//         list.stream()
//             .collect(Collectors.groupingBy(Employee::getDepartment));
//
//      groupedByDepartment.forEach(
//         (department, employeesInDepartment) -> 
//         {
//            System.out.println(department);
//            employeesInDepartment.forEach(
//               employee -> System.out.printf("   %s%n", employee));
//         }
//      );
//
//      // count number of Employees in each department
//      System.out.printf("%nCount of Employees by department:%n"); 
//
//      Map<String, Long> employeeCountByDepartment =
//         list.stream()
//             .collect(Collectors.groupingBy(Employee::getDepartment, 
//                TreeMap::new, Collectors.counting()));
//
//      employeeCountByDepartment.forEach(
//         (department, count) -> System.out.printf(
//            "%s has %d employee(s)%n", department, count));
//
///*  Output looks something like :
//
//        HR  4
//        IT  8
//        Sales  12
//*/
//
//
//      // sum of Employee salaries with DoubleStream sum method
//      System.out.printf(
//         "%nSum of Employees' salaries (via sum method): %.2f%n",
//         list.stream()
//             .mapToDouble(Employee::getSalary)
//             .sum());
//
//      // calculate sum of Employee salaries with Stream reduce method
//      System.out.printf(
//         "Sum of Employees' salaries (via reduce method): %.2f%n",
//         list.stream()
//             .mapToDouble(Employee::getSalary)
//             .reduce(0, (value1, value2) -> value1 + value2));  
//
//      // average of Employee salaries with DoubleStream average method
//      System.out.printf("Average of Employees' salaries: %.2f%n",
//         list.stream()
//             .mapToDouble(Employee::getSalary)
//             .average()
//             .getAsDouble());      
   } // end main

private static void studySecondLevl(List<String> words, char c, char d, int i) {
	// TODO Auto-generated method stub
	
	words.stream().filter(x->x.contains(""+c))
	.filter(x->!x.contains(""+d))
	.filter(x->x.length()>=i).count();
    Stream strings = Stream.of("A", "good", "day", "to", "write", "some", "Java");
   System.out.println(strings.reduce("",(x,y)->x=x+" "+y));
	
}

private static void studyFirstLevel(List<Employee> list) {
	// TODO Auto-generated method stub
	
	
    System.out.println(
    list.stream().filter(x->x.getLastName().startsWith("B")).count());
    list.stream().map(Employee::getLastName).filter(x->x.startsWith("B")).sorted().forEach(System.out::println);      
    
    list.stream().forEach(x->{
    	if(x.getLastName().startsWith("B")) {
    		
//    		x.setLastName(x.getLastName().toUpperCase());
    	Employee emp=	new Employee(x.getFirstName(), x.getLastName().toUpperCase(), x.getSalary(), x.getDepartment());
    	System.out.println(emp);
    	}
    });
    list.stream().forEach(x->{
    	if(x.getLastName().startsWith("B")) {
    		
    		x.setLastName(x.getLastName().toUpperCase());
//    		Employee emp=	new Employee(x.getFirstName(), x.getLastName().toUpperCase(), x.getSalary(), x.getDepartment());
    	}
    	System.out.println(x);
    });
    
    System.out.println(
    		list.stream().map(Employee::toString).collect(Collectors.joining(" , ")));
    System.out.println(
    		list.stream().map(Employee::toString).collect(Collectors.joining("---\n---")));
    
    list.stream().map(Employee::getLastName).filter(x->x.startsWith("I")).distinct().forEach(System.out::println);   
    System.out.println(
    		list.stream().mapToDouble(Employee::getSalary).average().getAsDouble()
    		);
    
    System.out.println(
    		list.stream().mapToDouble(Employee::getSalary).reduce(0, (x,y)->
    			x=x+y
    		)
    		);
    System.out.println(
    		list.stream().map(Employee::getSalary).collect(Collectors.summarizingDouble(Double::doubleValue)).getAverage()
    		);
    
    list.stream().map(Employee::getFirstName).forEach(System.out::println);
    
    Stream<Integer> a = Stream.iterate(0, x->x=x+2);
    a.limit(20).forEach(System.out::println);
    

}

















private static void proveAllMethods(List<Employee> list) {
	// TODO Auto-generated method stub
	
	Predicate<Employee> fourToSixThousand = 
			e -> (e.getSalary() >= 4000 && e.getSalary() <= 6000);
      System.out.printf("%nFirst employee who earns $4000-$6000:%n%s%n",
         list.stream()
             .filter(fourToSixThousand)
             .findFirst()
             .get());
      System.out.println(" GET employee   "+
      	list.stream().filter(fourToSixThousand).findAny().get().toString());
      
     Optional<String> found= list.stream().map(x->x.getFirstName()).filter(name->name.startsWith("J")).findFirst();
     System.out.println("first name "+found.orElse("no found"));
	
}
} // end class ProcessingEmployees

