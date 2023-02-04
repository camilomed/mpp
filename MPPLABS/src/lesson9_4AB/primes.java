package lesson9_4AB;

import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class primes {
	static Integer [] ints = {1,2,3,4,5};
	public static Supplier< Stream<Integer>> stInt = () -> Stream.of(ints);
	public static void main(String[] args) {
		
		
		primes ps = new primes();
		

		  System.out.println(stInt.get()
                  .filter(primes::isPrime)
                  .collect(Collectors.toList()));
		  ps.printFirstNPrimes(2);
	}
	private void printFirstNPrimes(int i) {
		
		System.out.println(stInt.get()
                .filter(primes::isPrime).limit(i)
                .collect(Collectors.toList()));
		
	}
	public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
	
	
}
