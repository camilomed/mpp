package ExtraCreditStandarExam1;

public class CheckingAccount extends Account {
	
	private double balance ;
	private  double monthlyFee;
	private String accId; 
	

	public CheckingAccount(String string, double d, int i) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getAccountId() {
		// TODO Auto-generated method stub
		return this.accId;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return this.balance;
	}

	@Override
	public double computeUpdateBalance() {
		// TODO Auto-generated method stub
		return balance-monthlyFee;
	}

}
