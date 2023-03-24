package Company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainCOmpany {
	
	public static void main(String[] args) {
		 List<Company> arr1 = new ArrayList<Company>();
	        arr1.add(new Company("Amazon", "Seattle", "Washington", 38606400000.0));
	        arr1.add(new Company("Microsoft", "Redmond", "Washington", 44323000000.0));
	        arr1.add(new Company("Apple", "Cupertino", "California", 57411000000.0));
	        arr1.add(new Company("Google", "Mountain View", "California", 40481000000.0));
	        arr1.add(new Company("Facebook", "Menlo Park", "California", 29232000000.0));
	        arr1.add(new Company("Coca-Cola", "Atlanta", "Georgia", 8120000000.0));
	        arr1.add(new Company("Johnson & Johnson", "New Brunswick", "New Jersey", 16137000000.0));
	        arr1.add(new Company("Procter & Gamble", "Cincinnati", "Ohio", 13221000000.0));
	        arr1.add(new Company("Verizon Communications", "New York City", "New York", 19500000000.0));
	        arr1.add(new Company("General Electric", "Boston", "Massachusetts", -570000000.0));
	        arr1.add(new Company("General Electric", "Nebraska", "Massachusetts", 57000000000.0));
	        arr1.add(new Company("General Electric", "DNebraska", "GMassachusetts", 57000.0));
	 
	        
//	        a(arr1);
//	        b(arr1);
//	        c(arr1);
//	        d(arr1);
//	        e(arr1);
//	        f(arr1);
//	        g(arr1);
//	        h(arr1);
	        stringTostream();
	}
	
	
	// revisar este codigo
private static void stringTostream() {
		// TODO Auto-generated method stub
	String inputString = "moon";
	
    Stream<Character> characterStream = inputString.chars().mapToObj(c -> (char) c);
    characterStream.forEach(System.out::print);
		
	}

private static void h(List<Company> arr1) {
		// TODO Auto-generated method stub
	
	List<Company> newList=arr1.stream().map(d->{
		if (d.getCompanyCity().startsWith("Mo")) {
		return	new Company(d.getCompanyName(), d.getCompanyCity().toUpperCase(), d.getCompanyState(), d.getTotalProfit());
		}
		
		return d;
	}).collect(Collectors.toList());
		
	}

private static void g(List<Company> arr1) {
		// TODO Auto-generated method stub
 Stream<Company> d = arr1.stream().filter(x->x.getCompanyCity().startsWith("D"));
 Stream<Company> m=	arr1.stream().filter(x->x.getCompanyCity().startsWith("M"));
 Stream<Company> other=	arr1.stream().filter(x->!(x.getCompanyCity().startsWith("D")))
			.filter(x->!(x.getCompanyCity().startsWith("M"))
					);
		Stream.concat(Stream.concat(d, m), other).forEach(System.out::println);
	}

//	revisar caso F que no se sabe bien como cumplir con todos los requisitos depronto con group By
	// pd solo en caso que solo se pueda en una linea de codigo
	private static void f(List<Company> arr1) {
		// TODO Auto-generated method stub
		arr1.stream().filter(x->x.getCompanyState().startsWith("G")).sorted(Comparator.comparing(Company::getCompanyState)).forEach(System.out::println);;
		arr1.stream().filter(x->!(x.getCompanyState().startsWith("G"))).forEach(System.out::println);
		
	}

	private static void e(List<Company> arr1) {
		// TODO Auto-generated method stub
		System.out.println(
		arr1.stream().filter(x-> x.getCompanyCity().equals("Nebraska"))
		.filter(x->x.getTotalProfit()>4000000).collect(Collectors.toList()));
		
	}

	private static void d(List<Company> arr1) {
		arr1.stream().forEach(x->{
			if (x.getCompanyCity().startsWith("A")) {
				x.setCompanyName(x.getCompanyName().toUpperCase());
			}
			System.out.println(x);
		});
		
	}

	private static void c(List<Company> arr1) {
		// TODO Auto-generated method stub
		System.out.println("c----------------");
		System.out.println(
		arr1.stream().mapToDouble(Company::getTotalProfit).reduce(0,(x,y)->x=x+y));
	}

	private static void b(List<Company> arr1) {
		// TODO Auto-generated method stub
		System.out.println("b----------------");
		System.out.println(
		arr1.stream().mapToDouble(Company::getTotalProfit).average().getAsDouble());
		
	}

	private static void a(List<Company> arr1) {
		System.out.println("a----------------");
//		   arr1.stream().filter(c->c.getCompanyCity().startsWith("C")).sorted(Comparator.comparing(Company::getCompanyCity))
//	        .distinct().forEach(System.out::println);;
		arr1.stream()
             .filter(c -> c.getCompanyCity().startsWith("S"))
             .map(Company :: getCompanyCity)
            .sorted()
            .distinct()
            .forEach(System.out::println);

	        
	}

}
