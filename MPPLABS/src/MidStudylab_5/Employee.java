package MidStudylab_5;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
	private String empId;
	private List<PayCheck> listPayCheck;
	
	
	
	public Employee(String empId) {
		super();
		this.empId = empId;
		this.listPayCheck= new ArrayList<PayCheck>();
	}
	public void print() {}
	public PayCheck calcCompensation(int month , int year) {
		return null;}
	public abstract double calcGrossPay(DateRange date);
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public List<PayCheck> getListPayCheck() {
		return listPayCheck;
	}
	public void setListPayCheck(List<PayCheck> listPayCheck) {
		this.listPayCheck = listPayCheck;
	}
	
	

}
