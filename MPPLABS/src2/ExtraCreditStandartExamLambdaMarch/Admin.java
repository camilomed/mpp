package ExtraCreditStandartExamLambdaMarch;

import java.util.List;
import java.util.stream.Collectors;

public class Admin {
	public static List<Student> obtainHonorRoll(List<Student> list) {
		
		
		return 
		list.stream().filter(x->x.getGpa()>3.0).filter(x->x.getMajor().equals("Computer Science")).collect(Collectors.toList());
		//implement
	}
}
