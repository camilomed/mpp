package ExtraCreditUml_Library;

public class ItemCopy implements IItemCopy{

	private String copy;
	private boolean available;
	private Loan loan;
	private IItem item;



	public ItemCopy(String copy, boolean available, IItem item) {
		super();
		this.copy = copy;
		this.available = available;
		this.item = item;
	}
	
	


	@Override
	public boolean checkAvailability() {
		// TODO Auto-generated method stub
		return available;
	}




	public String getCopy() {
		return copy;
	}




	public void setCopy(String copy) {
		this.copy = copy;
	}




	public boolean isAvailable() {
		return available;
	}



	@Override
	public boolean setAvailable(boolean available) {
		return this.available = available;
	}




	public Loan getLoan() {
		return loan;
	}




	public void setLoan(Loan loan) {
		this.loan = loan;
	}




	public IItem getItem() {
		return item;
	}




	public void setItem(IItem item) {
		this.item = item;
	}

	
	
}
