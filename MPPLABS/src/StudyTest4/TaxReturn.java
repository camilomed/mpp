package StudyTest4;

import java.time.LocalDate;

public class TaxReturn {

	private int tid;
	private LocalDate submitDate; 
	private Type type;
	public TaxReturn(int tid, LocalDate submitDate, Type type) {
		super();
		this.tid = tid;
		this.submitDate = submitDate;
		this.type = type;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public LocalDate getSubmitDate() {
		return submitDate;
	}
	public void setSubmitDate(LocalDate submitDate) {
		this.submitDate = submitDate;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	
	@Override
	public int hashCode() {
		return 0;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		if(obj==null)return false;
		if(this==obj)return true;
		return super.equals(obj);
	}
	
	
	
	
}
