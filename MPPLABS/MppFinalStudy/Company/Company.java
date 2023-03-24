package Company;

public class Company implements Comparable<Company> {
	
	private String companyName;
	private String companyCity;
	private String companyState;
	private double totalProfit;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyCity() {
		return companyCity;
	}
	public void setCompanyCity(String companyCity) {
		this.companyCity = companyCity;
	}
	public String getCompanyState() {
		return companyState;
	}
	public void setCompanyState(String companyState) {
		this.companyState = companyState;
	}
	public double getTotalProfit() {
		return totalProfit;
	}
	public void setTotalProfit(double totalProfit) {
		this.totalProfit = totalProfit;
	}
	public Company(String companyName, String companyCity, String companyState, double totalProfit) {
		super();
		this.companyName = companyName;
		this.companyCity = companyCity;
		this.companyState = companyState;
		this.totalProfit = totalProfit;
	}
	@Override
	public String toString() {
		
		return this.companyName+"  "+this.companyCity+"  "+this.companyState+"  "+this.totalProfit;
	}
	@Override
	public boolean equals(Object obj) {
		
		
			if (obj==null|| this.getClass() != obj.getClass())
				return false;
		Company c = (Company) obj;
			if (this.companyCity.equals(c.companyCity)
					&& this.companyName.equals(c.companyName)
					&& this.companyState.equals(c.companyState)
					&& this.totalProfit == c.getTotalProfit())
					return true;
		return false;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 31*this.companyCity.hashCode();
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Company c = (Company) this.clone();
		return c;
	}
	@Override
	public int compareTo(Company o) {
		// TODO Auto-generated method stub
		
		return 
		(companyName.compareTo(o.companyName));
	}
	
	
	
	

}
