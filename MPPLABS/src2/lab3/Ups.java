package lab3;

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
	@Override
	public void printHello() {
		// TODO Auto-generated method stub
		System.out.println("good bye");
	}
	
	
}
