package lesson7_2;

public class EquilateralTriangle implements Polygon {
	
	private double s1 ;

	public EquilateralTriangle(double s1) {
		super();
		this.s1 = s1;
	}

	public double getS1() {
		return s1;
	}

	public void setS1(double s1) {
		this.s1 = s1;
	}

	@Override
	public double[] leghts() {
		// TODO Auto-generated method stub
		return new double[] {s1,s1,s1};
	}

	
	

}
