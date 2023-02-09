package StudyLesson9_8;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main2 {
	List<OrderItem> orderItems = new ArrayList<>();
	public static void main(String[] args) {
		Main2 m = new Main2();
		m.loadOrderItemData();
		System.out.println("Do any of these Order Items have an order of flowers? " + 
		   m.findProduct("Flowers"));
	}
	
	private boolean findProduct(String prodName) {
		
		for(OrderItem item : orderItems) {
			Optional.ofNullable(item).map(x->x.getProduct()).map(x-> x.getProductName()).orElse("").compareTo(prodName);
			if(item != null) {
				Product p=item.getProduct();
				if(p != null) {
					String name = p.getProductName();
					if(name != null) {
						if(name.equals(prodName)) return true;
					}
				}
			}
		}
		return false;
	}
	
	private void loadOrderItemData() {
		orderItems.add(new OrderItem(new Product("1016", "Tools", 131.00), 3));
		orderItems.add(new OrderItem(new Product("1017", "Fishing Rod", 111.00), 1));
		orderItems.add(new OrderItem(new Product("1018", "Game of Go",66.00), 2));
		orderItems.add(new OrderItem(new Product("1019", "Flowers", 221.00), 5));
	}
}