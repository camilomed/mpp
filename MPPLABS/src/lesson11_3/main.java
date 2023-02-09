package lesson11_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class main {

	
	public static void main(String[] args) {
		
		List<Object> objs = new ArrayList<>();
		objs.add(1);
//		objs.add("two");
		List<? super Integer> ints1 = objs;
		ints1.add(3);
		double db2l = sum(ints1);

	}
	public static double sum(Collection<? extends Number> nums) {
		double s = 0.0;
		for(Number num : nums) s += num.doubleValue();
		return s;
		 }
}
