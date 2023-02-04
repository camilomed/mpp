package lesson9_9;

import java.util.stream.IntStream;

public class Squares {
	public static void main(String[] args) {	
		CreateSquares(4);
	}
	public static void CreateSquares(int num) {
		IntStream is= IntStream.iterate(1,ite->ite+1)
                .map(mul->mul*mul).limit(num);
		is.forEach( printNum->System.out.print(printNum+" "));	
	}
	
	}
