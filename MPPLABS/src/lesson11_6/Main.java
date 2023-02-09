package lesson11_6;
import java.util.*;
import java.util.function.*;


public class Main {

    //simple version
	public static boolean contains1(List<String> list, String s) {
		for(String x: list) {
			if(x == null && s == null) return true;
			if(s == null || x == null) continue;
			if(x.equals(s)) return true;
		}
		return false;	
	}
	
public static <T> boolean contains2(List<? extends T> list, T e, BiPredicate<? super T, ? super T> pred2) {
		
		for(T emp: list) {
			if(emp == null & e == null) return true;
			if(emp == null || e == null) return false;
			if(pred2.test(emp, e)) return true;
		}
		return false;
	};
	//your generalization -- should work with lists of
	//Employees, Accounts. You may not override equals
	//in the data-holder classes (like Employee, Account, etc)
	//so you need to find another way to deal with the fact
	//that these classes do not have their own equals methods.
	
	//public static boolean contains2(List<T> list ... )
	
	public static void test1() {
		List<String> list = Arrays.asList("Bob", "Joe", "Tom");
		boolean result = Main.contains1(list, "Tom");
		System.out.println(result);
	}
	
	public static void test2() {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1003, "Tom", 60000));
		list.add(new Employee(1002, "Harry", 70000));
		list.add(new Employee(1001, "Joe", 50000));
Employee e = new Employee(1001, "Joe", 5000);
		
		boolean foundIt = Main.contains2(list, e, (Employee e1, Employee e2) -> e1.getId() == e2.getId());
		System.out.print(foundIt);
				
	}
	
	public static void test3() {
		List<Manager> list = new ArrayList<>();
		list.add(new Manager(1003, "Tom", 60000, 700));
		list.add(new Manager(1002, "Harry", 70000, 400));
		list.add(new Manager(1001, "Joe", 50000, 500));
Manager e = new Manager(1001, "Joe", 5000, 500);
		
		boolean foundIt = Main.contains2(list, e, (Employee e1, Employee e2) -> e1.getId() == e2.getId());
		System.out.print(foundIt);
		
	}
	
	
	
	public static void test4() {
		List<Manager> list = new ArrayList<>();
		list.add(new Manager(1003, "Tom", 60000, 700));
		list.add(new Manager(1002, "Harry", 70000, 400));
		list.add(new Manager(1001, "Joe", 50000, 500));
		
		Manager m = new Manager(1001, "Joe", 5000, 500);
		
		boolean foundIt = Main.contains2(list, m, (Employee e, Person p) -> e.getName().equals(p.getName()));
		System.out.print(foundIt);
	}
		
		public void sort(List<Employee> emps, Employee e) {
		Collections.sort(emps, (e1, e2) -> {
		e.setSalary(10000);
		return e1.name.compareToIgnoreCase(e2.name);
		});
		}
		
		public enum Type extends Object{
			MEAT, FISH, OTHER;
			}
	
	public static void main(String[] args) {
		
		List<Employee> em = new ArrayList<>();
		 Employee newE = new Employee(6, "ff", 010);
		 Employee newE2 = new Employee(6, "ff", 010);
		 em.add(newE2);
		 em.add(newE);
		 Main mn = new Main();
//		 mn.sort(em, newE2);
		test1();
		test2();
		test3();
		test4();
	}	
		
		
	
}
