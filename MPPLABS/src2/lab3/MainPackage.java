package lab3;

import java.util.ArrayList;
import java.util.List;

public class MainPackage {
	
	


	public static void main(String[] args) {
		
		 IPackage[] methods = { new Ups(), new UsMail(), new Fedex() };
		 APackage book = new APackage("Book", 2, Zone.IA);
		 APackage phone = new APackage("Phone", 4, Zone.MA);
		 APackage boots = new APackage("Boots", 6, Zone.OTHER);
			List<APackage> listPackage = new ArrayList<APackage>();
			listPackage.add(book);
			listPackage.add(phone);
			listPackage.add(boots);
			
			for (IPackage i : listPackage) {
				i.printHello();
			}
			
		 for (APackage pack : listPackage) {
			 double cost =Double.MAX_VALUE;
			 String  type="";
			 double newCost=0;
		 for( IPackage method: methods) {
				method.printHello();
			newCost= ApplyDiscount( method.getPrice(pack),"student");
			 if ( newCost<cost) {
				 cost=newCost;
				 type = method.getClass().getSimpleName();
			 }
			 
		 }
		 System.out.println(pack.getName()+"   "+type+"   "+cost);
		 }
		
	
	
	}
	
	public static double ApplyDiscount(double cost , String person) {
		
		switch (person) {
		case "student": {
			return cost*0.9;
		}
		case"senior":{
			return cost*0.85;
		}
		}
		return cost;
	}
	
	
			
		

}
