package ExtraCreditUml_track;

public class CoporateCust extends ACustomer {
	
	private double creditLimit;
	private String creditRating;




	public CoporateCust(String name, String addres, String phone, double points, double creditLimit,
			String creditRating) {
		super(name, addres, phone, points);
		this.creditLimit = creditLimit;
		this.creditRating = creditRating;
	}




	public double getCreditLimit() {
		return creditLimit;
	}




	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}





	
	public String getCreditRating() {
		return creditRating;
	}




	public void setCreditRating(String creditRating) {
		this.creditRating = creditRating;
	}




	public double generateMontlyBill() {
		return 0;
	}





	public void generateMonthlyBill() {
		// TODO Auto-generated method stub
		
	}




	@Override
	public String getCreditRating(String creditRating) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
