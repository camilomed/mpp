package ExtraCreditsParallelStream;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Main {

	private static long comienzoContadorTiempo;
	private static long terminoTiempo;
	private static long tiempoTotal;
	
	
	 public static void main(String[] args) {
		 
		 
		 contador1(300);
		 contador1(40000);
		 contador1(800000);
		 contador1(1600000);

	    }


	private static void contador1(int j) {
		   List<Employee> myList = new ArrayList<>();

	        // add 300 Employee objects
	        for (int i = 1; i <= j; i++) {
	            myList.add(new Employee("Tom Jones " + i, "472-8000"));
	        }
	        
	        comienzoContadorTiempo = new GregorianCalendar().getTimeInMillis();
	        long countSequencial=0;
	        for ( int i=0; i<myList.size();i++) {
	        	
	        	if(myList.get(i).getName().contains("Tom")) {
	        		countSequencial++;
	        	}
	        }
	        terminoTiempo = new GregorianCalendar().getTimeInMillis();
	        
	        tiempoTotal = terminoTiempo - comienzoContadorTiempo;
	        System.out.println("sequential "+j+" :"+ tiempoTotal);
	        comienzoContadorTiempo = new GregorianCalendar().getTimeInMillis();
	        countSequencial = myList.stream().parallel().filter(x->x.getName().contains("Tom")).count();
	        terminoTiempo = new GregorianCalendar().getTimeInMillis();
	        tiempoTotal = terminoTiempo - comienzoContadorTiempo;		
	        System.out.println("Parallel "+j+" :"+ tiempoTotal);
		
	}
}
