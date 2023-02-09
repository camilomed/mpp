import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Prime {

	
	public static void main(String[] args) {
		
		
		Stream.iterate(1,n->n+2).limit(100).forEach(System.out::println);;
	}
}
