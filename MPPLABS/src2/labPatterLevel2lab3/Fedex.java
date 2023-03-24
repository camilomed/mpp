package labPatterLevel2lab3;

public class Fedex extends APackage {

public static final String Validate_ZONE1="^(IA|MT|OR|CA)";
public static final String Validate_ZONE2="^(TX|UT)";
public static final String Validate_ZONE3="^(FL|MA|OH)";
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
	String zone=	p.getZone().toString();
	if(zone.matches(Validate_ZONE1)) {
		return 0.35*p.getWeight();
	} else
	if(zone.matches(Validate_ZONE2)) {
		return 0.3 *p.getWeight();
	}else 
	if(zone.matches(Validate_ZONE3)) {
		return 0.55*p.getWeight();
	}else {
		return 0.43*p.getWeight();
	}
//	
//		switch (p.getZone()) {
//		case IA,MT,OR,CA: {
//			return 0.35*p.getWeight();
//		
//		}
//		case TX,UT:{
//			return 0.3 *p.getWeight();
//		}
//		case FL,MA,OH:{
//			return 0.55*p.getWeight();
//		}
//		case OTHER:{
//			return 0.43*p.getWeight();
//		}
//		
//		default:
////			throw new IllegalArgumentException("Unexpected value: " + this.getZone());
//		}
//		return 0;
	}
	

}
