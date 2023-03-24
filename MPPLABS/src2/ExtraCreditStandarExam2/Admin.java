package ExtraCreditStandarExam2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Admin {
	//Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
		public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
			List<String> phoneNums = new ArrayList<>();
			//implement
			
			for (LibraryMember member: members) {
				for (CheckOutRecorEntry check : member.getCheckOut().getCehckOutEntryList()) {
					
					if(check.getLendingItemType().equals(item)) {
						
						phoneNums.add(member.getPhone());
						break;
					}
				}
			}
			
			Collections.sort(phoneNums);
			return phoneNums;

}
}