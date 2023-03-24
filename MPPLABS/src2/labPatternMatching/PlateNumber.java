package labPatternMatching;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PlateNumber {
	
	private static final String VALIDATE_PLATE = "[a-zA-Z]{2}-\\d{3,4}-[a-zA-Z]{3}USA";
	
	public static void main(String[] args) {
		String plate = "ab-123-abcUSA";
		validatePlateWithPattern( plate);
		validatePlate( plate);
	}

	private static void validatePlateWithPattern(String plate) {
		 Matcher matcher;
		 Pattern pat = Pattern.compile(VALIDATE_PLATE);
		 matcher = pat.matcher(plate);
		 
		 System.out.println(matcher.matches());
		// TODO Auto-generated method stub
		
	}
	private static void validatePlate(String plate) {
		
		System.out.println(plate.matches(VALIDATE_PLATE));
		// TODO Auto-generated method stub
		
	}

}
