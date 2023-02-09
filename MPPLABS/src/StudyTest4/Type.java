package StudyTest4;

public enum Type {
	_1040, _1040A, _1040EZ, _1040NR;
	  
	private String abrevation;
	
	

	private Type() {
	}



	private Type(String abrevation) {
		this.abrevation = abrevation;
	}



	public String getAbrevation() {
		return abrevation;
	}

	
	
	
	
}
