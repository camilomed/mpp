package lab3_a;

public abstract class APackage implements IPackage {
	
	private String name;
	private double weight;
	private Zone zone;
	
	
	
	public APackage(String name, double weight, Zone zone) {
		super();
		this.name = name;
		this.weight = weight;
		this.zone = zone;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Zone getZone() {
		return zone;
	}
	public void setZone(Zone zone) {
		this.zone = zone;
	}
	@Override
	public abstract double getPrice();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	


}
