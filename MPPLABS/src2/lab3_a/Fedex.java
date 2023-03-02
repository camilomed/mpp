package lab3_a;

public class Fedex extends APackage {


	public Fedex() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fedex(String name, double weight, Zone zone) {
		super(name, weight, zone);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public double getPrice(APackage p) {

		switch (p.getZone()) {
		case IA,MT,OR,CA: {
			return 0.35*p.getWeight();
		
		}
		case TX,UT:{
			return 0.3 *p.getWeight();
		}
		case FL,MA,OH:{
			return 0.55*p.getWeight();
		}
		case OTHER:{
			return 0.43*p.getWeight();
		}
		
		default:
//			throw new IllegalArgumentException("Unexpected value: " + this.getZone());
		}
		return 0;
	}
	

}
