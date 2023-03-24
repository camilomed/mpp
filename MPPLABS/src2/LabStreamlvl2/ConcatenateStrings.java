package LabStreamlvl2;

import java.util.Arrays;
import java.util.stream.Stream;

public class ConcatenateStrings {
	
	public static void main(String[] args) {
		Stream strings = Stream.of("A", "good", "day", "to", "write", "some", "Java");
		System.out.println(
		concatenate(strings));
		
	}

	private static String concatenate(Stream<String> strings) {
	return (String) strings.
		reduce(" ", (x,y)->x=x+" "+y);
	}

}
