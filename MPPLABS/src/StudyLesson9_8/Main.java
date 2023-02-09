package StudyLesson9_8;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lesson8Study.firstProblem;

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
//			Optional<Object> fisrtOptional = Optional.ofNullable(item).map(x->x.getProduct()).map(x->x.getProductName());
//			 
//			if(fisrtOptional.isPresent()) {
//				if(
//						fisrtOptional.orElse("").equals(prodName))
//					return true;
//			}
			if( Optional.ofNullable(item).map(x->x.getProduct()).map(x->x.getProductName()).orElse("").equals(prodName))
				return true;
	}
		return false;
	}	
	private void loadOrderItemData() {
		orderItems.add(null);
		orderItems.add(new OrderItem(null, 1));
		orderItems.add(new OrderItem(new Product("1017", "Fishing Rod", 111.00), 1));
		orderItems.add(new OrderItem(new Product("1018", "Game of Go",66.00), 2));
		orderItems.add(new OrderItem(new Product("1019", "Flowers", 221.00), 5));
	}
}
