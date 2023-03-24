package practiceConference;

import java.util.ArrayList;
import java.util.List;

public class Conference {
	
	private String name;
	private List<IAttendee> list = new ArrayList<>();
	
	public void small() {
		for (IAttendee a : list) {
//			((Attendee) list)
			a.getName();
		}
	}

}
