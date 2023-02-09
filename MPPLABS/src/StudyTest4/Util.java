package StudyTest4;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Util {
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Olive", "Jackson",
				"Anna");
		Util u = new Util();
		
		names.stream().map(x-> {
			try {
				return Util.getTaxpayerByName(x);
			} catch (Exception e) {
				// TODO: handle exception
			}
			return null;
		});
		
	}
	
	public static TaxPayer getTaxpayerByName(String name) {
		
		TaxReturn r1 = new TaxReturn(0, null, null);
		TaxReturn r2 = new TaxReturn(0, null, null);
		TaxReturn r3 = new TaxReturn(0, null, null);
		TaxReturn r4 = new TaxReturn(0, null, null);
		List<TaxReturn> returns = Arrays.asList(r1 , r2, r3, r4);
		
		returns.stream().filter(x->x.getSubmitDate().getYear()==2016)
		.filter(x->x.getType().equals(Type._1040A)).sorted(Comparator.comparing(TaxReturn::getTid)).collect(Collectors.toList());
		returns.stream().filter(x-> "NR".equals(x.getType().getAbrevation())).distinct().collect(Collectors.toList());
		
		TaxPayer payer1 = null;
		TaxPayer payer2 = null;
		TaxPayer payer3 = null;
		TaxPayer payer4 = null;
		List<TaxPayer> payers = Arrays.asList(payer1, payer2, payer3, payer4);
		
		payers.stream().filter(x->x.getName().length()>5). map(x->x.getName()).sorted().collect(Collectors.joining(" , "));
		
		Optional<TaxPayer> isPayer= payers.stream().filter(x->x.getTx().size()>2).findAny();
		isPayer.isPresent();
		return null;
		
		
//		throws TaxPayerNotFOundException{
//			throw new TaxPayerNotFOundException(""+name);
//		}
//		
	}

}
