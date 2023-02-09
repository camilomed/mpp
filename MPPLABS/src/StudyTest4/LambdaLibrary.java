package StudyTest4;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import lesson9_11b.TriFunction;

public class LambdaLibrary {
	
	public final static Function<List<TaxReturn> , List<TaxReturn>> name = list->
	list.stream().filter(x->x.getSubmitDate().getYear()==2016)
	.filter(x->x.getType().equals(Type._1040A)).sorted(Comparator.comparing(TaxReturn::getTid)).collect(Collectors.toList());
	
	public final static TriFunction<List<TaxReturn>, Integer, Type, List<TaxReturn>> name2=(list,year,type)->
	list.stream().filter(x->x.getSubmitDate().getYear()==2016)
	.filter(x->x.getType().equals(Type._1040A)).sorted(Comparator.comparing(TaxReturn::getTid)).collect(Collectors.toList());
	
}
