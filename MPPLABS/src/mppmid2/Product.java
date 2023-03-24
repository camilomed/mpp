package mppmid2;

public class Product implements IProduct {

	
	private String description;
	private String productNum;
	private double price;
	private boolean inStock;
	private ICompPoints compPoint;
	
	
	
	


	public Product(String description, String productNum, double price, boolean inStock, ICompPoints compPoint) {
		super();
		this.description = description;
		this.productNum = productNum;
		this.price = price;
		this.inStock = inStock;
		this.compPoint = compPoint;
	}





	public boolean isInStock() {
		return inStock;
	}





	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}





	public ICompPoints getCompPoint() {
		return compPoint;
	}





	public void setCompPoint(ICompPoints compPoint) {
		this.compPoint = compPoint;
	}





	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getProductNum() {
		return productNum;
	}



	public void setProductNum(String productNum) {
		this.productNum = productNum;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

}
