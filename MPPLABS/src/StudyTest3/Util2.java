package StudyTest3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class Util2 {

	
		
	public static <T> List<String> filterMap(List<T> list, Function<T, Integer> ageFunction, Function<T, String> nameFunction) {
		List<String> names = new ArrayList<>();
		for (T item : list) {
			if (ageFunction.apply(item) > 20) {
				names.add(nameFunction.apply(item));
			}
		}
		return names;
	}
}
