package ExtraCreditUml_track;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
	public static  ArrayList<IProduct> inventory = new ArrayList<IProduct>();
	
	public static IProduct SearchInventory(String productnumber){
	   for (IProduct item : inventory ){
		   Product product =  (Product)item;
		   if (product.getProductNum() == productnumber){
			   return product;
		   }
	   }
	   return null;
	}

	public static void main(String[] args) throws ParseException {
		
		//Create list of products
		inventory.add(new Product("Mac Book", "0001", 1350.00, true, new ComputerPoints()));
		inventory.add(new Product("Surface Pro Laptop", "0002", 1700.00, false, new ComputerPoints()));
		inventory.add(new Product("Headset", "0003", 400.00, true, new Audio_VideoPoints()));
		inventory.add(new Product("VitC", "0004", 100.00, true, new HealthPoints()));
		inventory.add(new Product("Oil", "0005", 300.00, true, new OtherPoints()));
		
		//Generic 
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy"); 
		
		//Create Customer
		ACustomer corpCust = new CoporateCust("", "", "", 0, 0, "");
		corpCust.setCreditRating("");
		//Create Order (orderid, date)
		Date today = new Date();
		Order order1 = new Order("12345-123",null, false, 0, today, null, corpCust);
		order1.setCustomer(corpCust);
		Order order2 = new Order("4567-5678",formatter.parse("15-11-2018"));
		order2.setCustomer(corpCust);
		
		//Create orderline (qty, product, order)
		OrderLine firstOrder = new OrderLine(1, SearchInventory("0001"), order1);
		OrderLine secondOrder = new OrderLine(1, SearchInventory("0002"), order1);
		OrderLine thirdOrder = new OrderLine(1, SearchInventory("0003"), order1);
		OrderLine forthOrder = new OrderLine(1, SearchInventory("0004"), order1);
		OrderLine fifthOrder = new OrderLine(1, SearchInventory("0005"), order1);
		
		order1.addOrderLine(firstOrder);
		//order1.addOrderline(secondOrder);
		order1.addOrderLine(thirdOrder);
		order1.addOrderLine(forthOrder);
		order1.addOrderLine(fifthOrder);
		order1.addOrderLine(firstOrder);
		
		firstOrder = new OrderLine(5, SearchInventory("0001"), order2);
		secondOrder = new OrderLine(1, SearchInventory("0002"), order2);
		thirdOrder = new OrderLine(10, SearchInventory("0003"), order2);
		forthOrder = new OrderLine(20, SearchInventory("0004"), order2);
		fifthOrder = new OrderLine(20, SearchInventory("0005"), order2);
		
		order2.addOrderLine(firstOrder);
		order2.addOrderLine(secondOrder);
		order2.addOrderLine(thirdOrder);
		order2.addOrderLine(forthOrder);
		order2.addOrderLine(fifthOrder);
		order2.addOrderLine(firstOrder);
		
		//create order
		corpCust.addOrder(order1);
		corpCust.addOrder(order2);
		
		
		ACustomer PersonalCust = new PersonalCust("Pheakdey","IOWA","123-7456-7899", 0, null, null);
		//corpCust.setCreditRating(CreditRating.poor);
		//Create Order (orderid, date)
		Order porder1 = new Order("1245-890",formatter.parse("14-11-2018"));
		porder1.setCustomer(corpCust);
		
		Order porder2 = new Order("47502-758",formatter.parse("15-11-2018"));
		porder2.setCustomer(corpCust);
		
		//Create orderline (qty, product, order)
		firstOrder = new OrderLine(2, SearchInventory("0001"),porder1);
		secondOrder = new OrderLine(2, SearchInventory("0002"),porder1);
		thirdOrder = new OrderLine(2, SearchInventory("0003"),porder1);
		forthOrder = new OrderLine(2, SearchInventory("0004"),porder1);
		fifthOrder = new OrderLine(2, SearchInventory("0005"),porder1);
		
		porder1.addOrderLine(firstOrder);
		porder1.addOrderLine(secondOrder);
		porder1.addOrderLine(thirdOrder);
		porder1.addOrderLine(forthOrder);
		porder1.addOrderLine(fifthOrder);
		porder1.addOrderLine(firstOrder);
		
		
		firstOrder = new OrderLine(2, SearchInventory("0001"), porder2);
		secondOrder = new OrderLine(3, SearchInventory("0002"), porder2);
		thirdOrder = new OrderLine(2, SearchInventory("0003"), porder2);
		forthOrder = new OrderLine(4, SearchInventory("0004"), porder2);
		fifthOrder = new OrderLine(5, SearchInventory("0005"), porder2);
		porder2.addOrderLine(firstOrder);
		porder2.addOrderLine(secondOrder);
		porder2.addOrderLine(thirdOrder);
		porder2.addOrderLine(forthOrder);
		porder2.addOrderLine(fifthOrder);
		porder2.addOrderLine(firstOrder);
		
		//create order
		PersonalCust.addOrder(porder1);
		PersonalCust.addOrder(porder2);
		
		
		//print
		CoporateCust pCorpCust  =(CoporateCust)corpCust;
		pCorpCust.generateMonthlyBill();
	}
}