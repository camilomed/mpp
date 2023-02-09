package Studylesson9_9;

import java.util.stream.IntStream;

public class squares {

	
	public static void main(String[] args) {
		printSquares(3);
	}

	private static void printSquares(int i) {
		
		IntStream.iterate(1, n->n+1).map(m->m*m).limit(i).forEach(System.out::println);;
		// TODO Auto-generated method stub
		
	}
}
