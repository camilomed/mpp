package lesson8_4;

import java.util.Arrays;
import java.util.List;

public class Counter {
	
	public static void main(String[] args) {
		Counter count = new Counter();
		List<String> list = Arrays.asList("juadn","pdedro","madrks","javdier");
		System.out.println(count.countWords(list, 'd', 'y', 4)); 
		System.out.println(count.countWords1(list, 'd', 'y', 4)); 
	}
	
public int countWords(List<String> words, char c, char d, int len) {
		  return (int)words.stream()   
  	     .filter(word -> contain(word, c) && !contain(word, d) && word.length() >= len) 
  	     .count();
	}

private boolean contain(String word, char c) {
	// TODO Auto-generated method stub
	for (int i = 0; i < word.length(); i++) {
		if(word.charAt(i) == c)
			return true;
	}
	return false;
}
public int countWords1(List<String> words, char c, char d, int len) {
    return (int) words.stream()
        .filter(word -> word.length() >=len)
        .filter(word -> word.indexOf(c) >= 0)
        .filter(word -> word.indexOf(d) < 0)
        .count();
}

}
