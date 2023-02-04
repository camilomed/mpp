package lesson7_2;

public interface  Polygon extends ClosedCurve {
	public double [] leghts();
	
	@Override
	default double computePerimeter() {
		double sum =0;
		for(double lenght : leghts() ) {
			sum+= lenght;
		}
		// TODO Auto-generated method stub
		return sum;
	}
	

}
