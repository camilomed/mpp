package ExtraCreditsStream;

import java.util.List;
import java.util.stream.Collectors;

import lesson9_11b.TriFunction;

public class lambdaLibrary2 {
	
	public static  TriFunction<List<TaxReturn>, Integer, Type, List<TaxReturn>> nim= (list,date,type)->
	
		list.stream().filter(x->x.getSubmitDate().getYear()==2016).collect(Collectors.toList());

}
