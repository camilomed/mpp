package labPatternMatching;

public class ReplaceEight {
	
	
	public static void main(String[] args) {
		String num="1823485678";
		System.out.println(replace(num));
	}

	private static String replace(String num) {
		// TODO Auto-generated method stub
		return
		num.replaceAll("8", "eight");
		
	}

}
