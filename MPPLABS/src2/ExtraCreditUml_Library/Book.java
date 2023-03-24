package ExtraCreditUml_Library;

import java.util.Vector;

public class Book extends AItem {
	private String ISBN;
	private Vector<String> authorList;
	private int limit;
	public Book(String title, String iSBN, Vector<String> authorList, int limit) {
		super(title);
		ISBN = iSBN;
		this.authorList = new Vector<>();
		this.limit = limit;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public Vector<String> getAuthorList() {
		return authorList;
	}
	public void setAuthorList(Vector<String> authorList) {
		this.authorList = authorList;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	@Override
	public boolean checkAvaliablity() {
        for (IItemCopy ic :listItemCopy)
            if(ic.checkAvailability())
                return true;
        return false;

	}
	
	

}
