package practiceMidterm;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeIDChecker {
	private static String validate="^(IT|ST|GL)\\d{3,4}USA";
    public static boolean isValidEmployeeID(String employeeID) {
        Pattern pattern = Pattern.compile(validate);
        Matcher matcher = pattern.matcher(employeeID);
        System.out.println("matcher "+
        employeeID.matches(validate));
        return matcher.matches();
    }

    // Example usage
    public static void main(String[] args) {
        System.out.println(isValidEmployeeID("IT873USA"));  // true
        System.out.println(isValidEmployeeID("ST2387USA"));  // true
        System.out.println(isValidEmployeeID("GL213USA"));  // true
        System.out.println(isValidEmployeeID("IT12345USA"));  // false
        System.out.println(isValidEmployeeID("ST123USA"));  // false
        System.out.println(isValidEmployeeID("ABC123USA"));  // false
    }
}