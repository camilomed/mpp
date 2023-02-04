package lesson10_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static lesson10_3.FunctionWithException.unchecked;
public class FixThisSoln {
	List<String> processList(List<String> list)  {
		
	    return list.stream()
	    		   .map(x -> unchecked((String s) -> doNothingIfShort(s)).apply(x)) // This will fail to compile 
	               .collect(Collectors.toList());
	}
	
	 
	String doNothingIfShort(String input) throws InputTooLongException {
	    if (input.length() > 3) throw new InputTooLongException();
	    else return input;
	}
	
	public static void main(String[] args) {
		FixThisSoln ft = new FixThisSoln();
		List<String> words1 = Arrays.asList("not", "too", "big", "yet");
		System.out.println(ft.processList(words1));
		List<String> words2 = Arrays.asList("not", "tooo", "big", "yet");
		System.out.println(ft.processList(words2));
	}
	
	class InputTooLongException extends Exception {
		private static final long serialVersionUID = 1L;
		public InputTooLongException() {
			super("Must be length 3 or less");
		}
		public InputTooLongException(String s) {
			super(s);
		}
		public InputTooLongException(Throwable t) {
			super(t);
		}
	}
}
