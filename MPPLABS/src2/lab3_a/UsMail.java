package lab3_a;

public class UsMail extends APackage {

	
	

	public UsMail(String name, double weight, Zone zone) {
		super(name, weight, zone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrice() {
		
		if ( getWeight() <= 3 ) {
			return 1*getWeight();
		}
		
		// TODO Auto-generated method stub
		return 0.55 * getWeight();
	}
}
