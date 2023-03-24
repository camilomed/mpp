package mppmid2;

public class PersonalCust extends ACustomer {
	
	private String creditCardNum;
	private String creditRating;
	
	
	
	public PersonalCust(String name, String addres, String phone, double points, String creditCardNum,
			String creditRating) {
		super(name, addres, phone, points);
		this.creditCardNum = creditCardNum;
		this.creditRating = creditRating;
	}
	
	
	public void setCreditRating(String creditRating) {
		this.creditRating = creditRating;
	}


	public String getCreditCardNum() {
		return creditCardNum;
	}
	public void setCreditCardNum(String creditCardNum) {
		this.creditCardNum = creditCardNum;
	}
	@Override
	public String getCreditRating(String creditRating) {
		// TODO Auto-generated method stub
		return this.creditRating;
	}

	

}
