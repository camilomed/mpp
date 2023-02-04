package lesson9_10a;

import java.util.*;
import java.util.stream.Stream;

public class Or {

	public static void main(String[] args) {
		List<Simple> list = Arrays.asList(new Simple(false), new Simple(false), new Simple(true));

	}
	
	public boolean someSimpleIsTrue(List<Simple> list) {
		final boolean accum = false;
	boolean Simple;
	Optional<Boolean> acum = list.stream().map(a->a.flag).reduce((c,b) ->   c||b );
//		Stream.of(list).reduce((a, b) -> a || b);
//	 list.stream().reduce((a,b)-> accum);

//		for(Simple s: list) {
//			accum = accum || s.flag;
//		}
		return acum.get();
	}

}
