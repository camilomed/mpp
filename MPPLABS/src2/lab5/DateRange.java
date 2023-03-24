package lab5;

import java.time.LocalDate;

public class DateRange {

	private LocalDate startDate;
	private LocalDate endDate;
	
	
	public DateRange(LocalDate startDate, LocalDate endDate) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
	}


	public boolean isInRange(LocalDate date) {
		if ( date.getMonth().equals(startDate.getMonth())) {
			return true;
		}
		return false;
	}


	@Override
	public String toString() {
		return "DateRange [startDate=" + startDate + ", endDate=" + endDate + "]";
	}
	public static LocalDate getFirstdayOfMonth(LocalDate date) {
		return date.withDayOfMonth(1);
	}

	public static LocalDate getLastdayOfMonth(LocalDate date) {
		return  date.withDayOfMonth(date.getMonth().length(date.isLeapYear()));
		}
}
