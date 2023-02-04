package lesson8_5;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Consumer;


public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
	
		MyConsumer myConsumer = new ForEachExample().new MyConsumer();
		list.forEach(myConsumer::accept);
	}
	
	public static String toUpper(String s) {
		return s.toUpperCase();
	}
	
	//implement a Consumer
	
	 class MyConsumer implements Consumer<String> {

		@Override
		public void accept(String t) {
		System.out.println(toUpper(t));
			
		}
	}
}