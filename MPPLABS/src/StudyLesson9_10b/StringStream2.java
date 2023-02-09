package StudyLesson9_10b;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringStream2 {
	
	public static void main(String[] args) {
		System.out.println(
		Stream.of("bill","THomas","mary").collect(Collectors.joining(",")));
		
	IntSummaryStatistics e = Stream.of(1,2,3,4).collect(Collectors.summarizingInt(Integer::intValue));
		
	e.getSum();
	}

}
