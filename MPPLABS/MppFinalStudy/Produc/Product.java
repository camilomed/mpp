package Produc;

public class Product {
	
	private String ProductId;
	private String description;
	private String manufactor;
	private double price;
	public Product(String productId, String description, String manufactor, double price) {
		super();
		ProductId = productId;
		this.description = description;
		this.manufactor = manufactor;
		this.price = price;
	}
	public String getProductId() {
		return ProductId;
	}
	public void setProductId(String productId) {
		ProductId = productId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getManufactor() {
		return manufactor;
	}
	public void setManufactor(String manufactor) {
		this.manufactor = manufactor;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [ProductId=" + ProductId + ", description=" + description + ", manufactor=" + manufactor
				+ ", price=" + price + "]";
	}
	
	
	public boolean equals(Object obj) {
		if(obj==null) return false;
		return this.manufactor.equals(((Product)obj).manufactor);
	}
	
	
	
	

}
