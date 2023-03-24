package ExtraCreditUml_Library;

public class Magazine extends AItem {
	
	private int limit;
	private int issue;
	
	
	public Magazine(String title, int limit, int issue) {
		super(title);
		this.limit = limit;
		this.issue = issue;
	}
	
	


	public int getLimit() {
		return limit;
	}




	public void setLimit(int limit) {
		this.limit = limit;
	}




	public int getIssue() {
		return issue;
	}




	public void setIssue(int issue) {
		this.issue = issue;
	}




	@Override
	public boolean checkAvaliablity() {
		  for (IItemCopy ic :listItemCopy)
	            if(ic.checkAvailability())
	                return true;
	        return false;
	}

}
