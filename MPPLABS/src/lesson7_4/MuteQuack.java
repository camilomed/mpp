package lesson7_4;

public interface MuteQuack extends QuackBehavior {
	public default void quack() {
		System.out.println("  cannot quack");
	}
}
