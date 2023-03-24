package ExtraCreditStandarExam2;

public class LibraryMember {
	private String memberid;
	private String firtsName;
	private String lastName;
	private String phone;
	private CheckOutRecord checkOut;
	public LibraryMember(String memberid, String firtsName, String lastName, String phone) {
		super();
		this.memberid = memberid;
		this.firtsName = firtsName;
		this.lastName = lastName;
		this.phone = phone;
	}
	public String getMemberid() {
		return memberid;
	}
	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}
	public String getFirtsName() {
		return firtsName;
	}
	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public CheckOutRecord getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(CheckOutRecord checkOut) {
		this.checkOut = checkOut;
	}
	
	
	
	
}
