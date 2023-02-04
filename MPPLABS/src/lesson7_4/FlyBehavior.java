package lesson7_4;

public interface FlyBehavior {
	default void fly() {
		System.out.println("fly");
	}
}
