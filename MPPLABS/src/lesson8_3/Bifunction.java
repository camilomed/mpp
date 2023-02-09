package lesson8_3;

import java.util.function.BiFunction;

public class Bifunction {
	
	public static void main(String[] args) {
		lamdaMethod();
	}

	private static void lamdaMethod() {
		// TODO Auto-generated method stub
		BiFunction<Double, Double, Double> biFuntion =  Math::pow;
		System.out.println(biFuntion.apply(2.0, 3.0));
	}

}
