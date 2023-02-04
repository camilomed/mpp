package lesson7_2;

public class Ellipse implements ClosedCurve {

	private double semiMajAx;
	private double center;
	
	
	public Ellipse(double semiMajAx, double center) {
		super();
		this.semiMajAx = semiMajAx;
		this.center = center;
	}


	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return 4*semiMajAx*center;
	}

}
