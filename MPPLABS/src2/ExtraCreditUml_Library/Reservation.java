package ExtraCreditUml_Library;

import java.util.Date;

public class Reservation {
	
	private Date reservationDate;
	private IItem item;
	private Member member;
	public Reservation(Date reservationDate, IItem item) {
		super();
		this.reservationDate = reservationDate;
		this.item = item;
		this.member = member;
	}
	
	public boolean checkAvailable(IItem item) {
		return item.checkAvaliablity();
	}
	
}
