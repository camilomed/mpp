package labThread_6;

public class mainThreadClass_SmallNumTest {
	public static void main( String[] args ) throws InterruptedException {

        System.out.println("Inside main  ");   
        PrimeThread p1 = new PrimeThread(1,1000);
        p1.start();           
        
        PrimeThread p2 = new PrimeThread(1001, 2000);
        p2.start();
                
        PrimeThread p3 = new PrimeThread(2001, 3000);
        p3.start();
        
        PrimeThread p4 = new PrimeThread(3001, 4000);
        p4.start();
        
        PrimeThread p5 = new PrimeThread(4001, 5000);
        p5.start();
        
        PrimeThread p6 = new PrimeThread(5001, 6000);
        p6.start();
        
        PrimeThread p7 = new PrimeThread(6001, 7000);
        p7.start();
        
        PrimeThread p8 = new PrimeThread(7001, 8000);
        p8.start();
        
        PrimeThread p9 = new PrimeThread(8001, 9000);
        p9.start();
        
        PrimeThread p10 = new PrimeThread(9001, 10000);
        p10.start();
        
        p1.join();
        p1.printSortedPrimeList(); 
        p2.join();
        p2.printSortedPrimeList();
        p3.join();
        p3.printSortedPrimeList(); 
        p4.join();
        p4.printSortedPrimeList(); 
        p5.join();
        p5.printSortedPrimeList(); 
        p6.join();
        p6.printSortedPrimeList(); 
        p7.join();
        p7.printSortedPrimeList(); 
        p8.join();
        p8.printSortedPrimeList();
        p9.join();
        p9.printSortedPrimeList(); 
        p10.join();
        p10.printSortedPrimeList();
        
    }
}