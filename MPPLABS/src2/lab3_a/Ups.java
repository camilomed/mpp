package lab3_a;

public class Ups extends APackage {

	public Ups() {
		
	}
	public Ups(String name, double weight, Zone zone) {
		super(name, weight, zone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrice(APackage p) {
		// TODO Auto-generated method stub
		return 0.45*p.getWeight();
	}
}
