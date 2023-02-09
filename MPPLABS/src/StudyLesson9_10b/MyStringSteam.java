package StudyLesson9_10b;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyStringSteam {
	
	public static void main(String[] args) {
		
		 Stream<String>  stringStream = Stream.of("Bill","Thomas","Mary");
		 System.out.println(stringStream.collect(Collectors.joining(",")));
		 
		 Stream<Integer> myStringStream = Stream.of(1,2,3,4);
		System.out.println(	myStringStream.collect(Collectors.summarizingInt(Integer::intValue)));
//		 	myStringStream.min(Integer::min);
	}

}
