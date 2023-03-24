package ExtraCreditUml_Library;

import java.util.ArrayList;
import java.util.List;

public class Member implements IMember {
	
	private String id;
	private String name;
	private String address;
	private String phone;
	private List<Reservation> listReservation;
	private List<Loan> listLoan;
	
	public Member(String id, String name, String address, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.listLoan= new ArrayList<>();
		this.listReservation = new ArrayList<>();
	}
	@Override
	public void reserve(Reservation reservation) {
		listReservation.add(reservation);
		
	}
	@Override
	public void borrow(Loan loan) {
		// TODO Auto-generated method stub
		this.listLoan.add(loan);
		loan.getItemCopy().setAvailable(false);
		
	}
	@Override
	public void returnItem(Loan loan) {
		this.listLoan.remove(loan);
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
	
	

}
