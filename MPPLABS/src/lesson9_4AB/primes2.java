package lesson9_4AB;

import java.util.stream.Stream;

public class primes2 {

	public static void main(String[] args) {
		Stream.iterate(1, n-> n+2).limit(5).forEach(System.out::println);;
	}
	
		
}
