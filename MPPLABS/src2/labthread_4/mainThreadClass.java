package labthread_4;

public class mainThreadClass {

	
	public static void main( String[] args ) {

        System.out.println("Inside main  ");   
        PrimeThread p1 = new PrimeThread(1,200000);
        p1.start();
        
        PrimeThread p2 = new PrimeThread(200001, 400000);
        p2.start();
        
        PrimeThread p3 = new PrimeThread(400001, 600000);
        p3.start();
        
        PrimeThread p4 = new PrimeThread(600001, 800000);
        p4.start();
        
        PrimeThread p5 = new PrimeThread(800001, 1000000);
        p5.start();       
        
    }
}
