package EstudyConsumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
	
	public static void main(String[] args) {
		
		List<Double> values = Arrays.asList(20.3,32.3,43.3,34.3);
		Consumer<List<Double>> sqrtConsumer = list ->{
			for (int i=0;i<list.size();i++) {
				list.set(i, Math.sqrt(list.get(i)));
			}
		};
		
		Consumer<List<Double>> print = list -> list.stream().forEach(System.out::println);
		sqrtConsumer.andThen(print).accept(values); 
		
	}
		
}
