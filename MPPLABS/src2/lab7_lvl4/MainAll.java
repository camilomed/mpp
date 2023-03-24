package lab7_lvl4;

public class MainAll {

	public static void main(String[] args) {
		
		Person p = new Person("hola", "23223", 30);
		p.myDefault();
		p.myAbstract();
		
		InmutableService im = new InmutableService("name", "0000");
		InmutableService.setHourly(Hourly.MORNING);
	}
	
	
}
