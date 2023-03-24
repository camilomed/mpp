package lab7_lvl4;

public interface IPerson {
	default void myDefault() {
		System.out.println("From default method");
	}
	static void myStatic() {
		System.out.println("From static method");
	}
	abstract void myAbstract();
}
