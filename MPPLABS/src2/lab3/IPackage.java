package lab3;

public interface IPackage {
	
	public double getPrice(APackage p);
	default void printHello() {};

}
