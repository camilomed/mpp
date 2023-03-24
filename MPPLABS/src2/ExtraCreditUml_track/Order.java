package ExtraCreditUml_track;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	
	
	private String orderNumber;
	private String status;
	private boolean prepaid;
	private double orderPrice;
	private Date orderDate;
	private List<OrderLine> listOrderLine;
	private ICustomer customer;
	
	
	
	public Order(String orderNumber, Date orderDate) {
		super();
		this.orderNumber = orderNumber;
		this.orderDate = orderDate;
		this.listOrderLine = new ArrayList<OrderLine>();
	}





	public Order(String orderNumber, String status, boolean prepaid, double orderPrice, Date orderDate,
			List<OrderLine> listOrderLine, ICustomer customer) {
		super();
		this.orderNumber = orderNumber;
		this.status = status;
		this.prepaid = prepaid;
		this.orderPrice = orderPrice;
		this.orderDate = orderDate;
		this.listOrderLine = listOrderLine;
		this.customer = customer;
	}

	
	


	public ICustomer getCustomer() {
		return customer;
	}





	public void setCustomer(ICustomer customer) {
		this.customer = customer;
	}





	public void addOrderLine(OrderLine orderLine) {
		
		listOrderLine.add(orderLine);
	}



	public List<OrderLine> getListOrderLine() {
		return listOrderLine;
	}



	public void setListOrderLine(List<OrderLine> listOrderLine) {
		this.listOrderLine = listOrderLine;
	}



	public String getOrderNumber() {
		return orderNumber;
	}



	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public boolean isPrepaid() {
		return prepaid;
	}



	public void setPrepaid(boolean prepaid) {
		this.prepaid = prepaid;
	}



	public double getOrderPrice() {
		return orderPrice;
	}



	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}



	public Date getOrderDate() {
		return orderDate;
	}



	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}



}
