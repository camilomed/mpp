package LabStreamlvl3_5;


public class Course {

	private String number;
	private String title;
	private int units;
	private Person person;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTSitle(String title) {
		this.title = title;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public Course(String number, String title, int units,Person person) {
		super();
		this.number = number;
		this.title = title;
		this.units = units;
		this.person= person;
	}


}

