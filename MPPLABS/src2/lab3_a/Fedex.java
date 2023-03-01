package lab3_a;

public class Fedex  extends APackage{
	



	public Fedex(String name, double weight, Zone zone) {
		super(name, weight, zone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrice() {
		
		switch (this.getZone()) {
		case IA,MT,OR,CA: {
			return 0.35*getWeight();
		
		}
		case TX,UT:{
			return 0.3 *getWeight();
		}
		case FL,MA,OH:{
			return 0.55*getWeight();
		}
		case OTHER:{
			return 0.43*getWeight();
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + this.getZone());
		}
		
		
	}
	

}
