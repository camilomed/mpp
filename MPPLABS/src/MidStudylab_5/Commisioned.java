package MidStudylab_5;

import java.util.ArrayList;
import java.util.List;

public class Commisioned extends Employee  {

	private double commision;
	private double baseSalary;
	private List<Order> listOrder;
	
	public Commisioned(String empId, double commision, double baseSalary, List<Order> listOrder) {
		super(empId);
		this.commision = commision;
		this.baseSalary = baseSalary;
		this.listOrder = new ArrayList<Order>();
	}

	public void addOrder(Order o) {
		this.listOrder.add(o);
	}
	
	@Override
	public double calcGrossPay(DateRange date) {
		double total=0.0;
		for ( Order order : listOrder) {
			if(date.isInRange(order.getOrderDate())) {
				
				total+=order.getOrderAmount();
			}
		}
		// TODO Auto-generated method stub
		return baseSalary+( total*commision);
	}

	public double getCommision() {
		return commision;
	}

	public void setCommision(double commision) {
		this.commision = commision;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	
}
