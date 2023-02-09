package lesso7b;

public class Doubleton {
	
	private static Doubleton instance1;
	private static Doubleton instance2;
	private static int cont ;
	private Doubleton () {}
	
	public static Doubleton getInstance() {
		if (cont ==0) {
			if (instance1==null) {
				instance1= new Doubleton();
			}
			cont++;
			return instance1;
		}else if(cont==1) {
			if (instance2== null) {
				instance2 = new Doubleton();
			}
			cont++;
			
			
		}
		return instance2;
		
	}

}
