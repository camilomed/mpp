package LabStreamLvl3_7;

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

import labStreamlvl3_6.Department;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProcessingEmployees
{
	
//	public static  double maxSalary=0;
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
         new Employee("Wendy", "Brown", 4236.4, "Marketing")};

      // get List view of the Employees
      List<Employee> list = Arrays.asList(employees);
      
      excersice7Print(list);
//      excersiseFromClass(list);

      
   } // end main


private static void excersice7Print(List<Employee> list) {
	
	System.out.println("printing excersice 7 lvl 3 ");
	
	System.out.println("Print out each department and the average salary for the department.");
	
	 Map<String, Double> departmentAvarageSalary = list.stream().
			 collect(Collectors.groupingBy
					 (Employee::getDepartment, TreeMap::new,Collectors.averagingDouble(Employee::getSalary)));
	 
	 departmentAvarageSalary.forEach((name,avarage)->{
		 System.out.println("Name of department "+name+" Avarage salary: "+ avarage);
	 });
	 
	 System.out.println("Print out each department and the maximum salary for the department.");
	 
	 Map<String, List<Employee>> departmentListEmployee = list.stream().
			 collect(Collectors.groupingBy
					 (Employee::getDepartment));
	 
	 
	 
	 // 1 metodo 
	 System.out.println("metodo 1 -----------------");
	 departmentListEmployee.forEach((name,listDepartment)->{
		 System.out.println("name : "+ name +"max Salary:  "+
		 listDepartment.stream().mapToDouble(Employee::getSalary).max().getAsDouble());
	 });
	 // preguntar al profesor porque en el forech no puedo usar  una variable de afuera
	 
	 System.out.println("metodo 2 -----------------");
	 //2 metodo
	 departmentListEmployee.forEach((name,department)->{
		 
		 double maxSalary=0;
for (int i=0;i<department.size();i++) {
	 if(maxSalary<department.get(i).getSalary()) {
		 maxSalary= department.get(i).getSalary();
	 }
}	
//		 double maxSalary=0;
//		System.out.println("name "+name +"max salary "+maxSalary);
//		 department.forEach(p->{
//		 if(maxSalary<p.getSalary()) {
//			 maxSalary= p.getSalary();
//		 }
//		 });
//		 
	 });
	 
	 System.out.println("Print out each department and all of the employees who work at that department.  ");
	 
	 departmentListEmployee.forEach((name,department)->{
		 
		 System.out.println(name);
		 department.forEach(d-> System.out.println("Employe name "+d.getFirstName()));
	 });
	
			
	// TODO Auto-generated method stub
	
}
private static void excersiseFromClass(List<Employee> list) {
	// display all Employees
    System.out.println("Complete Employee list:");
    list.stream().forEach(System.out::println);   //A method reference.
    
    // Predicate (boolean-valued function) that returns true for salaries 
    //in the range $4000-$6000
    Predicate<Employee> fourToSixThousand = 
       e -> (e.getSalary() >= 4000 && e.getSalary() <= 6000);

       Predicate<Employee> f= e-> (e.getSalary()>500 && e.getSalary()>3000);
       
    // Display Employees with salaries in the range $4000-$6000
    // sorted into ascending order by salary
    System.out.printf(
       "%nEmployees earning $4000-$6000 per month sorted by salary:%n");

    list.stream()
        .filter(fourToSixThousand)
        .sorted(Comparator.comparing(Employee::getSalary))
        .forEach(System.out::println);

    // Display first Employee with salary in the range $4000-$6000
    System.out.printf("%nFirst employee who earns $4000-$6000:%n%s%n",
       list.stream()
           .filter(fourToSixThousand)
           .findFirst()
           .get());

    // Functions for getting first and last names from an Employee
    Function<Employee, String> byFirstName = Employee::getFirstName;
    Function<Employee, String> byLastName = Employee::getLastName;

    // Comparator for comparing Employees by first name then last name
    Comparator<Employee> lastThenFirst = 
       Comparator.comparing(byLastName).thenComparing(byFirstName);

    // sort employees by last name, then first name 
    System.out.printf(
       "%nEmployees in ascending order by last name then first:%n");
    list.stream()
        .sorted(lastThenFirst)
        .forEach(System.out::println);

    // sort employees in descending order by last name, then first name
    System.out.printf(
       "%nEmployees in descending order by last name then first:%n");
    list.stream()
        .sorted(lastThenFirst.reversed())
        .forEach(System.out::println);

    // display unique employee last names sorted
    System.out.printf("%nUnique employee last names:%n");
    list.stream()
        .map(Employee::getLastName)
        .distinct()
        .sorted()
        .forEach(System.out::println);

    // display only first and last names
    System.out.printf(
       "%nEmployee names in order by last name then first name:%n"); 
    list.stream()
        .sorted(lastThenFirst)
        .map(Employee::getName)
        .forEach(System.out::println);

    // group Employees by department
    System.out.printf("%nEmployees by department:%n"); 
    Map<String, List<Employee>> groupedByDepartment =
       list.stream()
           .collect(Collectors.groupingBy(Employee::getDepartment));

    
    // preguntar este metodo 
    groupedByDepartment.forEach(
       (department, employeesInDepartment) -> 
       {
          System.out.println(department);
          employeesInDepartment.forEach(
             employee -> System.out.printf("   %s%n", employee));
       }
    );

    // count number of Employees in each department
    System.out.printf("%nCount of Employees by department:%n"); 

    Map<String, Long> employeeCountByDepartment =
       list.stream()
           .collect(Collectors.groupingBy(Employee::getDepartment, 
              TreeMap::new, Collectors.counting()));

    employeeCountByDepartment.forEach(
       (department, count) -> System.out.printf(
          "%s has %d employee(s)%n", department, count));

/*  Output looks something like :

      HR  4
      IT  8
      Sales  12
*/


    // sum of Employee salaries with DoubleStream sum method
    System.out.printf(
       "%nSum of Employees' salaries (via sum method): %.2f%n",
       list.stream()
           .mapToDouble(Employee::getSalary)
           .sum());

    // calculate sum of Employee salaries with Stream reduce method
    System.out.printf(
       "Sum of Employees' salaries (via reduce method): %.2f%n",
       list.stream()
           .mapToDouble(Employee::getSalary)
           .reduce(0, (value1, value2) -> value1 + value2));  

    // average of Employee salaries with DoubleStream average method
    System.out.printf("Average of Employees' salaries: %.2f%n",
       list.stream()
           .mapToDouble(Employee::getSalary)
           .average()
           .getAsDouble());      
	
}

} // end class ProcessingEmployees

