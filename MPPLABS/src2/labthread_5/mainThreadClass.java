package labthread_5;

public class mainThreadClass {

	
	public static void main( String[] args ) {

		 System.out.println("Inside main  ");   
	        PrimeThread p1 = new PrimeThread(1,100000);
	        p1.start();
	        
	        PrimeThread p2 = new PrimeThread(100001, 200000);
	        p2.start();
	        
	        PrimeThread p3 = new PrimeThread(200001, 300000);
	        p3.start();
	        
	        PrimeThread p4 = new PrimeThread(300001, 400000);
	        p4.start();
	        
	        PrimeThread p5 = new PrimeThread(400001, 500000);
	        p5.start();
	        
	        PrimeThread p6 = new PrimeThread(500001, 600000);
	        p6.start();
	        
	        PrimeThread p7 = new PrimeThread(600001, 700000);
	        p7.start();
	        
	        PrimeThread p8 = new PrimeThread(700001, 800000);
	        p8.start();
	        
	        PrimeThread p9 = new PrimeThread(800001, 900000);
	        p9.start();
	        
	        PrimeThread p10 = new PrimeThread(900001, 1000000);
	        p10.start();
    }
}
