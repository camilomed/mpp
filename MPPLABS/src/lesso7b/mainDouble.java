package lesso7b;

public class mainDouble {
	private static Doubleton doub;
	private static Doubleton doub2;
	
	public static void main(String[] args) {
		
	doub=	Doubleton.getInstance();
	doub2=	Doubleton.getInstance();
	}

}
