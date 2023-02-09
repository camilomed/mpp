package StudyStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreatingStream {

	
	
	public static void main(String[] args) {
		
		
		int [] arrInt = {1,2,3,4};
		Stream<int []> strOfInt = Stream.of(arrInt);
		
	 Stream<Integer> strInteger = Stream.iterate(1, n-> n+2).limit(8).skip(4);
		
//	 strInteger.forEach(5);
//		System.out.println(strInteger.collect(Collectors.toList()));
		strInteger.forEach(System.out::println);
	}
}
