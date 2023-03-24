package LabStreamLvl3_7;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class QuestionForEach {
	
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
	      
	      Map<String, List<Employee>> departmentListEmployee = list.stream().
	    		  collect(Collectors.groupingBy
	    				  (Employee::getDepartment));
	      
//	      departmentListEmployee.forEach((name,department)->{
//	    	  
//			 double maxSalary=0;
//			System.out.println("name "+name +"max salary "+maxSalary);
//			 department.forEach(p->{
//			 if(maxSalary<p.getSalary()) {
//				 maxSalary= p.getSalary();
//			 }
//			 });
//	    	  double maxSalary=0;
//	    	  for (int i=0;i<department.size();i++) {
//	    		  if(maxSalary<department.get(i).getSalary()) {
//	    			  maxSalary= department.get(i).getSalary();
//	    		  }
//	    	  }	
//			 
//	      });
	   }

}
