package lesson10_6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class testQue {
	 private static Queue que = new Queue();
	    private static Executor exc = Executors.newCachedThreadPool();

	    public static void main(String[] args) {
	        for (int i = 0; i < 10; i++)     	createACall();   
	        


	    }


	    public static void createACall() {
	        Runnable r = () -> {
	            for (int i = 0; i < 20; i++)  	que.add((int)Math.ceil(Math.random() * 1000));
	            	        };
	        for (int i = 0; i < 10; i++)      	exc.execute(r);
	        try {
	            Thread.sleep(1000);
	        }
	        catch (InterruptedException e){
	        	throw new Error("Error");
	        }
	    }
}
