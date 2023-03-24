package lab5;
import java.time.LocalDate;
import java.time.LocalDateTime;
public class MainEmpPay {

	
	
	
    public static void main(String[] args) {
    	 Employee salaried = new Salaried(1,2900);
    	 Employee hourly = new Hourly(2, 32, 40);
    	 Employee Commissioned = new Commisioned(3, 2000);

        Order order1 = new Order(1, LocalDate.of(2023,2,1),3299);
        Order order2 = new Order(2, LocalDate.of(2023,2,1),3299);
        Order order3 = new Order(3, LocalDate.of(2023,2,1),3299);
        Order order4 = new Order(4, LocalDate.of(2023,2,1),3299);

        Commissioned.addOrder(order1);
        Commissioned.addOrder(order2);
        Commissioned.addOrder(order3);
        Commissioned.addOrder(order4);

        salaried.addPayCheck(salaried.calcCompensation(1, 2023));
        salaried.addPayCheck(salaried.calcCompensation(2, 2023));
        salaried.addPayCheck(salaried.calcCompensation(3, 2023));
        salaried.print();

        System.out.println("////////////////////////////////////////////////////");
        hourly.addPayCheck(hourly.calcCompensation(1, 2023));
        hourly.addPayCheck(hourly.calcCompensation(2, 2023));
        hourly.addPayCheck(hourly.calcCompensation(3, 2023));
        hourly.print();

        System.out.println("////////////////////////////////////////////////////");
        Commissioned.addPayCheck(Commissioned.calcCompensation(1, 2023));
        Commissioned.addPayCheck(Commissioned.calcCompensation(2, 2023));
        Commissioned.addPayCheck(Commissioned.calcCompensation(3, 2023));
        Commissioned.print();

    }

}
