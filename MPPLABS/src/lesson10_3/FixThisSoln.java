package lesson10_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static lesson10_3.FunctionWithException.unchecked;
public class FixThisSoln {
	List<String> processList(List<String> list)  {
		
	    return list.stream()
	    		   .map(x -> unchecked((String s) -> notMove(s)).apply(x)).collect(Collectors.toList());
	}
	
	 
	String notMove(String input) throws exceptLong {
	    if (input.length() > 3) throw new exceptLong();
	    else return input;
	}
	
	public static void main(String[] args) {
		FixThisSoln sonFix = new FixThisSoln();
		List<String> words1 = Arrays.asList("not", "too", "big", "yet");
		System.out.println(sonFix.processList(words1));
		List<String> words2 = Arrays.asList("not", "tooo", "big", "yet");
		System.out.println(sonFix.processList(words2));
	}
	
	class exceptLong extends Exception {
		private static final long serialVersionUID = 1L;
		public exceptLong() {
			super("Must be length 3 or less");
		}
		public exceptLong(String s) {
			super(s);
		}
		public exceptLong(Throwable t) {
			super(t);
		}
	}
}
