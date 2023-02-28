package lab3_1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class mainCompany {
	
	public static void main(String[] args) {
		
		Date date = new Date(1990, 2, 2);
		Employee emp1 = new Employee(0, "juan", "perez", "Garcia", "898-79", date, 4000);
		Employee emp2 = new Employee(1, "pablo", "perez", "Garcia", "898-79", date, 4000);
		Position pos1 = new Position("Back End", "java");
		pos1.addEmployee(emp1);
		pos1.addEmployee(emp2);
		Employee emp3 = new Employee(2, "javier", "perez", "Garcia", "898-79", date, 4000);
		Employee emp4 = new Employee(3, "roberto", "perez", "Garcia", "898-79", date, 4000);
		Position pos2 = new Position("front End", "Angular");
		pos2.addEmployee(emp3);
		pos2.addEmployee(emp4);
		Position pos3 = new Position("new Ia", "its no actual Employees");
		
		Department dep1 = new Department("department1", "Seattle");
		dep1.addDPosition(pos1);
		dep1.addDPosition(pos2);
		dep1.addDPosition(pos3);
		Department dep2 = new Department("Department2", "Chicago");
		dep2.addDPosition(pos1);
		dep2.addDPosition(pos2);
		
		
		Company company = new Company("Strat up");
		company.addDepartment(dep1);
		company.addDepartment(dep2);
		company.print();
	}

}
