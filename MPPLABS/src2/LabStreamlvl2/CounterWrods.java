package LabStreamlvl2;

import java.util.Arrays;
import java.util.List;

public class CounterWrods {
	
	public static void main(String[] args) {
		
		List<String> words  =Arrays.asList("India","china","Bhutan","colom");
		System.out.println(
		countWords(words,'c','d',5));
	}

	private static int countWords(List<String> words, char c, char d, int i) {
		return
		  (int) words.stream().filter(w->w.length()==i).filter(w->w.contains(""+c)).filter(w->!w.contains(""+d)).count();
	}

}
