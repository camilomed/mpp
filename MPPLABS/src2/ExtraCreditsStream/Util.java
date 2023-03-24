package ExtraCreditsStream;

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
		TaxReturn r1 = new TaxReturn(1, LocalDate.of(2022, 3, 15), Type._1040);
		TaxReturn r2 = new TaxReturn(2, LocalDate.of(2016, 3, 16), Type._1040A);
		TaxReturn r3 = new TaxReturn(3, LocalDate.of(2022, 3, 17), Type._1040EZ);
		TaxReturn r4 = new TaxReturn(4, LocalDate.of(2022, 3, 18), Type._1040NR);

		// Create 4 tax payers and add tax returns to them
		TaxPayer payer1 = new TaxPayer(1, "John Smith");
		payer1.setTx(Arrays.asList(r1, r2));

		TaxPayer payer2 = new TaxPayer(2, "Mary Johnson");
		payer2.setTx(Arrays.asList(r3));

		TaxPayer payer3 = new TaxPayer(3, "James Brown");
		payer3.setTx(Arrays.asList(r4, r1));

		TaxPayer payer4 = new TaxPayer(4, "Elizabeth Davis");
		payer4.setTx(Arrays.asList(r2, r3, r4));

		// Add tax payers to a list
		List<TaxPayer> payers = Arrays.asList(payer1, payer2, payer3, payer4);

		// Add tax payers to their respective tax returns
		r1.setPayer(payer1);
		r2.setPayer(payer1);
		r3.setPayer(payer2);
		r4.setPayer(payer3);
		List<TaxReturn> returns = Arrays.asList(r1 , r2, r3, r4);
//		Create a stream pipeline that, when run, finds a list of TaxReturn objects for which submitDate’s year is 2016 and the Type is 1040A, and sort them by tid.
		
		returns.stream().filter(x->x.getSubmitDate().getYear()==2016)
		.filter(x-> x.getType().equals(Type._1040A)).sorted(Comparator.comparing(TaxReturn::getTid));
		
//		Create a stream pipeline that, when run, finds a list of distinct TaxReturn objects for which Type’s abbrevation is "NR".
		returns.stream().filter(x->x.getType().getAbrevation().equals("NR")).distinct();
		
//		Create a stream pipeline that, when run, returns a String of all TaxPayers’ names for which name’s length is greater than 5, sorted alphabetically.
		
		
		payers.stream().map(TaxPayer::getName).filter(x->x.length()>5).collect(Collectors.joining(" , "));
		
//		Create a stream pipeline that, when run, determines whether there is any TaxPayer who only submitted 2 TaxReturns. No Credit if you use count() or list.size() to check.
		payers.stream().filter(x->x.getTx().size()>2).collect(Collectors.toList());		
		
		
		return null;
		
		
//		}
//		
	}

}
