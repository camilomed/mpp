package mppmid2;

public class MilistaryCustomer extends ACustomer {
	
	private String name;
	private double  maximumSpend;
	
	

	public MilistaryCustomer(String name, String addres, String phone, double points, String name2,
			double maximumSpend) {
		super(name, addres, phone, points);
		name = name2;
		this.maximumSpend = maximumSpend;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMaximumSpend() {
		return maximumSpend;
	}

	public void setMaximumSpend(double maximumSpend) {
		this.maximumSpend = maximumSpend;
	}

	@Override
	public void setCreditRating(String creditRating) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getCreditRating(String creditRating) {
		// TODO Auto-generated method stub
		return null;
	}

}
