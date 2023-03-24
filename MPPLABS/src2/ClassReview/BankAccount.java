package ClassReview;

public class BankAccount {
	
	String accountNumber;
	double blance;
	Customer c1;



	@Override
	public String toString() {
		
		return accountNumber+ " " +blance;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		BankAccount b = (BankAccount) obj;
		return accountNumber.equals(b.getAccountNumber());
	}
	@Override
	public int hashCode() {
		return 31*accountNumber.hashCode();
	}
	
	

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		BankAccount b = (BankAccount)super.clone();
		 b.c1  = (Customer) c1.clone();
		return b;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBlance() {
		return blance;
	}

	public void setBlance(double blance) {
		this.blance = blance;
	}

	public Customer getC1() {
		return c1;
	}

	public void setC1(Customer c1) {
		this.c1 = c1;
	}
	
	
	
	
	
}
