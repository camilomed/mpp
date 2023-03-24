package mppmid2;

import java.util.ArrayList;
import java.util.List;

public abstract class ACustomer implements ICustomer {
	
	
	private String name;
	private String addres;
	private String phone;
	private double points;
	private List<Order> listOrder;
	
	
	
	

	public ACustomer(String name, String addres, String phone, double points) {
		super();
		this.name = name;
		this.addres = addres;
		this.phone = phone;
		this.points = points;
		this.listOrder = new ArrayList<Order>();
	}

	public void addOrder(Order order) {
		listOrder.add(order);
		
	}




	public List<Order> getListOrder() {
		return listOrder;
	}






	public void setListOrder(List<Order> listOrder) {
		this.listOrder = listOrder;
	}






	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getAddres() {
		return addres;
	}





	public void setAddres(String addres) {
		this.addres = addres;
	}





	public String getPhone() {
		return phone;
	}





	public void setPhone(String phone) {
		this.phone = phone;
	}





	public double getPoints() {
		return points;
	}





	public void setPoints(double points) {
		this.points = points;
	}





	public  abstract String getCreditRating(String creditRating);
	
	public double averageOrderPrice() {
		 double total=0;
		 double cont=0;
		
		for (Order order : listOrder) {
			total =order.getOrderPrice();
			cont++;
		}
		return total/cont;
		
	}
	
	public double smallesPriceInsideAnOrderLine() {
		
		double lessPrice=listOrder.get(0).getListOrderLine().get(0).getPrice();
		for (Order order : listOrder) {
			for (OrderLine orderline: order.getListOrderLine()) {
				if(lessPrice>orderline.getPrice()) {
					lessPrice= orderline.getPrice();
				}
			}
			
		}
		
		return lessPrice;
	}

	public void printOrders() {
		// TODO Auto-generated method stub
		
	}
}
