package lesson11_5;

import java.util.ArrayList;
import java.util.List;

public class SecondSmallest<T extends Comparable<T>> {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(2);
		list.add(7);
		list.add(1);
		list.add(9);

		System.out.println(SecondSmallest.secondSmallest(list));
	}
    public static <T extends Comparable<T>> T secondSmallest(List<T> list) {
        if (list == null || list.size() < 2) {
            throw new IllegalArgumentException("Error");
        }
        T first = list.get(0);
        T second = list.get(1);
        if (first.compareTo(second) > 0) {
            T temp = first;
            first = second;
            second = temp;
        }
        for (int i = 2; i < list.size(); i++) {
            T current = list.get(i);
            if (current.compareTo(first) < 0) {
                second = first;
                first = current;
            } else if (current.compareTo(second) < 0 && current != first) {
                second = current;
            }
        }
        return second;
    }
}