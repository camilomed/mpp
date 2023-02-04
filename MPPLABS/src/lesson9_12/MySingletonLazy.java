package lesson9_12;

import java.util.Optional;

public class MySingletonLazy {
	
	private static MySingletonLazy instance= null;
	
	private MySingletonLazy getInstance() {
		  
		return Optional.ofNullable(instance).orElse(createInstance());
	}
	
	private MySingletonLazy createInstance() {
		return new MySingletonLazy();
		
		
	}
	
	

}
