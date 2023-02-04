package lesson8_b;

import java.util.function.Supplier;

public class methods {
	
	public static void main(String[] args) {
		
		partA();
		partB();
		System.out.println( new methods().new partC().get());
		
	}


	private static void partB() {
		// TODO Auto-generated method stub
		Supplier<Double> random = Math::random;
		System.out.println(random.get().doubleValue());
		
	}


	private static void partA() {
		// TODO Auto-generated method stub
		System.out.println(new Supplier<Double>() {

			@Override
			public Double get() {
				// TODO Auto-generated method stub
				return Math.random();
			}
		}.get());
		
	}
	
	
	
	class partC implements Supplier<Double> {

		@Override
		public Double get() {
			// TODO Auto-generated method stub
			return  Math.random();
		}
		
	}

}
