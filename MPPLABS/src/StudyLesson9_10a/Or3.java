package StudyLesson9_10a;

import java.util.*;

public class Or3 {

	public static void main(String[] args) {
		List<Simple> list = Arrays.asList(new Simple(false), new Simple(false), new Simple(true));

	}
	
	public boolean someSimpleIsTrue(List<Simple> list) {
		
		return list.stream().map(s->s.flag).reduce(false,(x,y)->x||y);
	}

}
