package ExtraCreditUml_track;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderLine {

	
	public int quantity;
	public double price;
	public String status;
	public Date statusDate;
	public double points;
	public Order order;
	public List<IProduct> listProducts;
	
	public OrderLine(int quantity,IProduct product, Order order) {
		this.quantity=quantity;
		this.order= order;
		listProducts = new ArrayList<IProduct>();
		Product item = (Product)product;
		for (int x=1; x<= this.quantity; x++){
			listProducts.add(item);
			price = price + item.getPrice();
			points= points +item.getCompPoint().getPoints();
		}
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getStatusDate() {
		return statusDate;
	}
	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}
	public double getPoints() {
		return points;
	}
	public void setPoints(double points) {
		this.points = points;
	}
	public List<IProduct> getListProducts() {
		return listProducts;
	}
	public void setListProducts(List<IProduct> listProducts) {
		this.listProducts = listProducts;
	}
	
	
	public void addProduct(IProduct product) {
		
		listProducts.add(product);
	}
	
	
	
}
