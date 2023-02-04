package lesson7_4;

public interface CannotFly extends FlyBehavior {
	public default void fly() {
		System.out.println("  cannot fly");
	}
}
