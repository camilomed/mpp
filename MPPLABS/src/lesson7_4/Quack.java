package lesson7_4;

public interface Quack  {
	default void quack() {
		System.out.println("  quacking");
	}
}
