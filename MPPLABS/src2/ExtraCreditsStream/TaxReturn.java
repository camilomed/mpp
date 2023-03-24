package ExtraCreditsStream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaxReturn {

	private int tid;
	private LocalDate submitDate; 
	private Type type;
	private List<TaxPayer> listTaxPayer = new ArrayList<>();
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
	public void setPayer(TaxPayer payer1) {
		this.listTaxPayer.add(payer1);
		// TODO Auto-generated method stub
		
	}
	public List<TaxPayer> getListTaxPayer() {
		return listTaxPayer;
	}
	public void setListTaxPayer(List<TaxPayer> listTaxPayer) {
		this.listTaxPayer = listTaxPayer;
	}
	
	
	
	
}
