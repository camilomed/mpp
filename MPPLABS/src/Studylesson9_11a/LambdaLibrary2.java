package Studylesson9_11a;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaLibrary2 {
	
//	 Function<List<Employee>, String> NAMES_OF_EMPLOYEES = list ->
//     list.stream()
	public final static  Function<List<Employee>, String> name = list ->
    list.stream().filter(x->x.getSalary()>10000).filter(x->x.getLastName().charAt(0)>'M')
	 .sorted(Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getLastName))
	  .map(e -> e.getFirstName() + " " + e.getLastName())
	  .collect(Collectors.joining(", "));
}
