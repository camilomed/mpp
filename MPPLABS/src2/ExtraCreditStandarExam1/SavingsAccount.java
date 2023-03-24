package ExtraCreditStandarExam1;

public class SavingsAccount extends Account {

	private double balance;
	private double interestRate;
	private String accId;

	public SavingsAccount(double balance, double interestRate, String accId) {
		super();
		this.balance = balance;
		this.interestRate = interestRate;
		this.accId = accId;
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
		return balance+(interestRate*balance);
	}

}
