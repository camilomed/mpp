package lesson9_9;

import java.util.stream.IntStream;

import Studylesson9_9.squares;

public class Squares {
	public static void main(String[] args) {	
		CreateSquares(4);
	}
	public static void CreateSquares(int num) {
		
		  IntStream.iterate(1, i -> i + 1)
	        .limit(num)
	        .forEach(i -> System.out.print(squarePrint(i)+" , "));
//		IntStream is= IntStream.iterate(1,ite->ite+1)
//                .limit(num).forEach(i -> System.out.println());
//		is.forEach( printNum->System.out.print(printNum+" "));	
	}
	
	public static int squarePrint(int num) {
		int x = num*num;
//		System.out.println(x);
		return x;
		
	}
	
	}
