package lab3;

public class UsMail extends APackage  {


	
	public UsMail() {
	}

	public UsMail(String name, double weight, Zone zone) {
		super(name, weight, zone);
	}

	@Override
	public double getPrice(APackage p) {
		if ( p.getWeight() <= 3 ) {
			return 1*p.getWeight();
		}
		
		// TODO Auto-generated method stub
		return 0.55 * p.getWeight();
	}

}
