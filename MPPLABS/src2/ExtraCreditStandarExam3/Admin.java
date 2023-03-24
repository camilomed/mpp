package ExtraCreditStandarExam3;

public class Admin {
	
	private Department[] dept = new Department[2];

	public Admin(Department[] dept) {
		super();
		this.dept = dept;
	}
	
	
		public String hourlyCompanyMessage() {
			String result="";
			for ( Department dep: dept) {
				result+= dep.nextMessage();
			}
			return result;
		}
		
		public String format(String name, String message) {
			
			return name + " : " + message + "\n";
			
		}

}
