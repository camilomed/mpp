package lab5;

import java.time.LocalDate;
import java.util.Date;

public class Order {
	
	private int orderNo;
	private LocalDate orderDate;
	private double orderAmount;
	private Commisioned commisioned;
	public Order(int orderNo, LocalDate orderDate, double orderAmount) {
		super();
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}
	public Commisioned getCommisioned() {
		return commisioned;
	}
	public void setCommisioned(Commisioned commisioned) {
		this.commisioned = commisioned;
	}
	
	
	
	

}
