package lesson9_8;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
	List<OrderItem> orderItems = new ArrayList<>();
	public static void main(String[] args) {
		Main m = new Main();
		m.loadOrderItemData();
		System.out.println("Do any of these Order Items have an order of flowers? " + 
		   m.findProduct("Flowers"));
	}
	
	private boolean findProduct(String prodName) {
		
		
		for(OrderItem item : orderItems) {
			
			if(findItem(item).isPresent()) {
				Product p =findItem(item).get().getProduct();
				if(findName(p.getProductName()).isPresent()) {
					if(p.getProductName().equals(prodName)) return true;
				}
			}
		}
		return false;
	}
	
	private static Optional<OrderItem> findItem(OrderItem item){
		
		return Optional.ofNullable(item);
		
	}
	private static Optional<String> findName(String name){
		
		return Optional.ofNullable(name);
		
	}
	
	private void loadOrderItemData() {
		orderItems.add(new OrderItem(new Product("1016", "Tools", 131.00), 3));
		orderItems.add(new OrderItem(new Product("1017", "Fishing Rod", 111.00), 1));
		orderItems.add(new OrderItem(new Product("1018", "Game of Go",66.00), 2));
		orderItems.add(new OrderItem(new Product("1019", "Flowers", 221.00), 5));
	}
}
