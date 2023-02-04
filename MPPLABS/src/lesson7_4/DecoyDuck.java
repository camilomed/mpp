package lesson7_4;

public class DecoyDuck extends Duck implements CannotFly, MuteQuack {
	@Override
	public void display() {
		System.out.println("  displaying");
		
	}
}
