package StudyTest3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Util {
	
	
	public static <T > List<T > filterMap(List<T> list, Function<T   , Integer> f1 ,Function<T, String> f2){
		
		List<String> name = new ArrayList<>();
		
		for ( T item : list) {
			
			if(f1.apply(item)>20) { 
				name.add(
				f2.apply(item));
			}
		}
		return list;
		
	}
	
	 public static List<String> filterMapEmployee(List<Employee> list){
		 List<String > names= new ArrayList<>();
		 for(Employee e : list) {
			 if(e.getAge()>20) {
				 names.add(e.getFirstName());
			 }
		 }
		return null;
		 
		 
	 }

}
