package ExtraCreditStandarExam2;

import java.time.LocalDate;

public class CheckOutRecorEntry {
	
	private LocalDate checkOutDate;
	private LocalDate dueDate;
	private LendingItem lendingItem;
	private ItemType lendingItemType;
	
	
	public CheckOutRecorEntry(LocalDate checkOutDate, LocalDate dueDate, LendingItem lendingItem,
			ItemType lendingItemType) {
		super();
		this.checkOutDate = checkOutDate;
		this.dueDate = dueDate;
		this.lendingItem = lendingItem;
		this.lendingItemType = lendingItemType;
	}
	public LocalDate getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(LocalDate checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public LendingItem getLendingItem() {
		return lendingItem;
	}
	public void setLendingItem(LendingItem lendingItem) {
		this.lendingItem = lendingItem;
	}
	public ItemType getLendingItemType() {
		return lendingItemType;
	}
	public void setLendingItemType(ItemType lendingItemType) {
		this.lendingItemType = lendingItemType;
	}
	
	
	
	
	
	

}
