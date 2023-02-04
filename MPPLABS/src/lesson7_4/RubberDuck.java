package lesson7_4;

public class RubberDuck extends Duck implements MuteQuack,CannotFly {
	@Override
	public void display() {
		System.out.println("  displaying");
		
	}
}
