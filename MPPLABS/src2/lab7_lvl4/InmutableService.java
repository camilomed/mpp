package lab7_lvl4;

public final class InmutableService {

	
	 private final String name;
	 private final String phone;
	 private static Hourly hourly;
	 
	public InmutableService(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public static Hourly getHourly() {
		return hourly;
	}
	public static void setHourly(Hourly hourly) {
		InmutableService.hourly = hourly;
	}
	 
	 
	
}
