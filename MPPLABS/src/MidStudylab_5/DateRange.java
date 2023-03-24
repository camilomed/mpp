package MidStudylab_5;

import java.time.LocalDate;
import java.util.Date;

public class DateRange {

	private LocalDate startDate;
	private LocalDate endDate;
	
	
	public  boolean isInRange(LocalDate date) {
		if ( date.getMonth().equals(startDate.getMonth())) {
			return true;
		}
		return false;	
		}


	@Override
	public String toString() {
		return "DateRange [startDate=" + startDate.toString() + ", endDate=" + endDate.toString() + "]";
	}
	
	public static int getFirstDayOfMonth(LocalDate date) {
		return 0;
	}
	public static int getLastDayOfMonth(LocalDate date) {
		return 0;
	}
	
}
