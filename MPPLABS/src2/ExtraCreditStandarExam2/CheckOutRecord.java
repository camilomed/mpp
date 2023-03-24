package ExtraCreditStandarExam2;

import java.util.ArrayList;
import java.util.List;

public class CheckOutRecord {
	
	private List<CheckOutRecorEntry> listCheckOutEntry= new ArrayList<>();
	public  List<CheckOutRecorEntry> getCehckOutEntryList(){
		
		return listCheckOutEntry;
		}
	
	public void addCheckEntry(CheckOutRecorEntry entry) {
		
		listCheckOutEntry.add(entry);
	}

}
