package lab3_1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class mainCompany {
	
	public static void main(String[] args) {
		
		Date date = new Date(1990, 2, 2);
		Employee emp1 = new Employee(1, "Tom", "", "Garcia", "898-79", date, 200000);
		Employee emp2 = new Employee(2, "Stan", "", "Garcia", "898-79", date, 140000);
		Employee emp3 = new Employee(3, "Sue ", "", "Garcia", "898-79", date, 130000);
		Employee emp4 = new Employee(4, "Marc  ", "", "Garcia", "898-79", date, 120000);
		Employee emp5 = new Employee(5, "Bill  ", "", "Garcia", "898-79", date, 110000);
		Employee emp6 = new Employee(6, "Peter ", "", "Garcia", "898-79", date, 100000);
		Employee emp7 = new Employee(7, "Dan  ", "", "Garcia", "898-79", date, 90000);
		Employee emp8 = new Employee(8, "Ron  ", "", "Garcia", "898-79", date, 290000);
		Position pos1= new Position(TypePosition.DeptHead, "",emp8);
		Position pos2= new Position(TypePosition.Senior1, "",emp2);
		Position pos3= new Position(TypePosition.Junior1, "",emp1);
		Position pos4= new Position(TypePosition.Junior1, "",emp3);
		Position pos5= new Position(TypePosition.Junior1, "",emp4);
		
		Position pos6= new Position(TypePosition.Senior2, "",emp6);
		Position pos7= new Position(TypePosition.Junior2, "",emp5);
		Position pos8= new Position(TypePosition.Junior2, "",emp7);
		
		Department dep1 = new Department("Sales", "Seattle");
		
		dep1.addPosition(pos1);
		dep1.addPosition(pos2);
		dep1.addPosition(pos3);
		dep1.addPosition(pos4);
		dep1.addPosition(pos5);
		dep1.addPosition(pos6);
		dep1.addPosition(pos7);
		dep1.addPosition(pos8);
		
		
		Employee empM1 = new Employee(1, "Anne", "", "Garcia", "898-79", date, 200000);
		Employee empM2 = new Employee(2, "Gary", "", "Garcia", "898-79", date, 140000);
		
		Position posM1= new Position(TypePosition.DeptHead, "",empM1);
		Position posM2= new Position(TypePosition.Senior1, "",empM2);
		Department dep2 = new Department("Marketing", "Seattle");
		dep2.addPosition(posM1);
		dep2.addPosition(posM2);
		
//		Position pos2= new Position(TypePosition.Senior, "");
			
		
//		Position pos2 = new Position("Vice President", "java");
//		Position pos2 = new Position("Vice President", "java");
		
//		Employee emp4 = new Employee(3, "roberto", "perez", "Garcia", "898-79", date, 4000);
//		Position pos2 = new Position("front End", "Angular");
//		pos2.setEmployee(emp3);
//		Position pos3 = new Position("new Ia", "its no actual Employees");
		
//		Department dep1 = new Department("department1", "Seattle");
//		dep1.addPosition(pos1);
//		dep1.addPosition(pos2);
//		dep1.addPosition(pos3);
//		Department dep2 = new Department("Department2", "Chicago");
//		dep2.addPosition(pos1);
//		dep2.addPosition(pos2);
		
		
		Company company = new Company("Strat up");
		company.addDepartment(dep1);
		company.addDepartment(dep2);
		company.print();
		System.out.println(company.getSalary());
	}

}
