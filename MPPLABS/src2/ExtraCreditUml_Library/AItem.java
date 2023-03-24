package ExtraCreditUml_Library;

import java.util.ArrayList;
import java.util.List;

public abstract class AItem  implements IItem{
	
	private String title;
	protected  List<IItemCopy> listItemCopy;
	
	
	
	
	
	public AItem(String title) {
		super();
		this.title = title;
		this.listItemCopy = new ArrayList<IItemCopy>();
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public  abstract boolean checkAvaliablity();
	
	public void addItemCopy(IItemCopy item) {
		listItemCopy.add(item);
	}
	
	

}
