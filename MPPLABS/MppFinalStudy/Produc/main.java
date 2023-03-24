package Produc;

import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class main {
	
	public static void main(String[] args) {
		
	    List<Product> productList = new ArrayList<>();
        productList.add(new Product("P001", "iPhone 12", "StPApple", 999.99));
        productList.add(new Product("P002", "Galaxy S21", "Stamsung", 899.99));
        productList.add(new Product("P003", "Pixel 5", "Google", 699.99));
        productList.add(new Product("P004", "OnePlus 9", "OnePlus", 729.99));
        productList.add(new Product("P005", "MacBook Pro", "Apple", 1499.99));
        productList.add(new Product("P006", "Surface Laptop 4", "HP", 999.99));
        productList.add(new Product("P007", "XPS 13", "Dell", 1199.99));
        productList.add(new Product("P008", "ThinkPad X1 Carbon", "Lenovo", 1499.99));
        productList.add(new Product("P009", "iPad Pro", "PStHApple", 799.99));
        productList.add(new Product("P010", "xp", "Dell", 199.99));
        productList.add(new Product("P011", "XPS 13", "PDell", 19.99));
        
        studyAgain(productList);
        
//        System.out.println(
//        productList.stream().mapToDouble(Product::getPrice).average().getAsDouble());
//        
//       productList.stream().map(Product::getManufactor);
       
//        productList.stream().
//        filter(m->m.getManufactor().startsWith("P"))
//        .sorted(Comparator.comparing(Product::getManufactor)).distinct().forEach(System.out::println);
//        
//        System.out.println(
//        productList.stream().filter(m->m.getManufactor().equals("Dell")).
//        filter(p->p.getPrice()>40.0)
//        .collect(Collectors.toList()));
//        
//        productList.stream().forEach(x->{
//        	if(x.getManufactor().startsWith("D"))
//        		x.setManufactor(x.getManufactor().toUpperCase());
//        	System.out.println(x);
//        });
//        
        
//        productList.stream().filter(p->p.getManufactor().startsWith("L")).sorted(Comparator.comparing(Product::getManufactor)).forEach(System.out::println);
//        productList.stream().filter(p->!(p.getManufactor().startsWith("L"))).forEach(System.out::println);
        
//		Stream<Product> d = productList.stream().filter(p->p.getManufactor().startsWith("D"));
//		Stream<Product> h = productList.stream().filter(p->p.getManufactor().startsWith("H"));
//		Stream<Product> others = productList.stream().filter(p->!(p.getManufactor().startsWith("D"))).
//				filter(p->!(p.getManufactor().startsWith("H")));
//		 Stream.concat(Stream.concat(d,h),others);
		
//	        Stream.concat(Stream.concat(d, h), others).forEach(p-> System.out.println(p));;
        
        
//        productList.stream().map(e-> {
//        	
//        	if(e.getManufactor().startsWith("St")) {
//        	return new Product(e.getProductId(), e.getDescription(), e.getManufactor().toUpperCase(), e.getPrice());
//        	}
//        	return e;
//        }).forEach(System.out::println);;
//        System.out.println(
//	        productList.stream().map(Product::toString).collect(Collectors.joining("****")));
        

	}

	private static void studyAgain(List<Product> l) {
		// TODO Auto-generated method stub
		double a = l.stream().mapToDouble(Product:: getPrice).average().getAsDouble();
		print(a);
		
	   l.stream().map(Product::getManufactor).filter(x->x.startsWith("P")).sorted().distinct()
		.forEach(System.out::println);
	   
	   double c = l.stream().mapToDouble(Product::getPrice).reduce(0, (x,y)->x=x+y);
	   print(c);
	   
	   List<Product>	d=   l.stream().filter(x-> x.getManufactor().startsWith("D")).
	   filter(x-> x.getPrice()>=40).collect(Collectors.toList());
	   print(d);
		
	   l.stream().forEach(x->{
		   if(x.getManufactor().startsWith("D")) {
			   x.setManufactor(x.getManufactor().toUpperCase());
		   }
		   System.out.println(x);
	   });
	   System.out.println("f ********************************");
	   Stream<Product> L = l.stream().filter(x->x.getManufactor().startsWith("L")).sorted(Comparator.comparing(Product::getManufactor));
	   Stream<Product> notL = l.stream().filter(x->!x.getManufactor().startsWith("L"));
	   Stream.concat(L, notL).forEach(System.out::println);;
	   
	   
	   System.out.println("g ********************************");
	   Stream<Product> H=   l.stream().filter(x->x.getManufactor().startsWith("H"));
	   Stream<Product> D=   l.stream().filter(x->x.getManufactor().startsWith("D"));
	   Stream<Product> Others=   l.stream().filter(x->!x.getManufactor().startsWith("D")).filter(x->!x.getManufactor().startsWith("H"));
	   Stream.concat(Stream.concat(H, D), Others).forEach(System.out::println);;
	   
	   System.out.println("h ********************************");
	   
	List<Product> h = l.stream().map(x->{
		   if(x.getManufactor().startsWith("St")) {
			   return new Product(x.getProductId(), x.getDescription(), x.getManufactor().toUpperCase(), x.getPrice());
		   }
		   return x;
	   }).collect(Collectors.toList());
	System.out.println(h);
	System.out.println("i ********************************");
	
	String s1 = l.stream().map(Product::toString).collect(Collectors.joining("*****\n"));
	print(s1);

	System.out.println("j ********************************");
	l.stream().map(x->{
		if(x.getDescription().length()>=3) {
			 char[] cha = x.getDescription().toCharArray();
			 cha[2]= x.getDescription().toUpperCase().charAt(2);
			 	String finalC = new String(cha);
			 
			x.setDescription(finalC);
		}
		return x;
	}).forEach(System.out::println);;
		
	}
	
	private static <T> void print(T obj) {
		
		System.out.println(obj);
	}
	

}
