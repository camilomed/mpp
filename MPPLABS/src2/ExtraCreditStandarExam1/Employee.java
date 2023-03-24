package ExtraCreditStandarExam1;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private String name;
	private List<Account> listAccount;

	public Employee(String name) {
		super();
		this.name = name;
		this.listAccount = new ArrayList<>();
	}
	

	public String getName() {
		return name;
	}



	public double computeUpdatedBalanceSum() {
		double total = 0;
		for ( Account ac : listAccount) {
			total =ac.computeUpdateBalance();
		}
		//implement
		return total;
	}

	public void addAccount(Account account) {
		
		listAccount.add(account);
		// TODO Auto-generated method stub
		
	}
}