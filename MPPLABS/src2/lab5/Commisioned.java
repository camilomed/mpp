package lab5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Commisioned extends Employee {

	public double commision=0.07;
	public double baseSalary;
	public List<Order> listOrder;
	
	
	public Commisioned(int empId,  double baseSalary) {
		super(empId);
		this.commision = commision;
		this.baseSalary = baseSalary;
		this.listOrder = new ArrayList<>();
	}


	@Override
	public double calcGrossPay(DateRange dateRange) {
		double totalOrder=0;
		for ( Order order: listOrder ) {
			if (dateRange.isInRange(order.getOrderDate())) {
				
				
				totalOrder= order.getOrderAmount();
			}
			
		}
		// TODO Auto-generated method stub
		return baseSalary+ totalOrder*commision;
	}
	
	public void addOrder(Order order) {
		listOrder.add(order);
	}

}
