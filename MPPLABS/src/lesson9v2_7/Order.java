package lesson9v2_7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Order {

	static List<Integer> intList = Arrays.asList(4, 5, -2, 0, -3, -1, -5, -4);
	static Comparator<Integer> na = Comparator.comparing(e-> Math.abs(e));
	
	public static void main(String[] args) {
		//expected output: [0, -1, -2, -3, -4, 4, -5, 5]
		ordering1(intList);
		List<String> stringList = Arrays.asList("cba", "efg", "doe", "fie", "set");
		//expected output: [cba, fie, doe, efg, set]
		ordering2(stringList);
		
	}
	
	//Orders the integers according to this pattern:
	// 0, -1, 1, -2, 2, -3, 3, . . .
	//Using this ordering, this method sorts the list as part of 
	//a stream pipeline, and prints to the console
	public static void ordering1(List<Integer> list) {
		
	List<Integer> newList = list.stream().sorted(Comparator.comparing((e-> Math.abs((int) e))).thenComparing(num-> (int)num )
			 
			 ).collect(Collectors.toList());			;
//		for (int num : list) {
//			System.out.println(a.);
//		}
		System.out.println(newList);
		
	}
	
	//Orders words by first reversing each and comparing 
	//in the usual way.  So 
	//    cba precedes bed
	//since
	//    cba.reverse() precedes bed.reverse()
	//in the usual ordering
	//Using this ordering, this method sorts the list as part of 
	//a stream pipeline, and prints to the console
	public static void ordering2(List<String> words) {
		   StringBuilder input1 = new StringBuilder();
	List<String> newListWords = words.stream().sorted(Comparator.comparing(e -> input1.append(e).reverse().toString())).collect(Collectors.toList());
		System.out.println(newListWords);
				
	}
}
