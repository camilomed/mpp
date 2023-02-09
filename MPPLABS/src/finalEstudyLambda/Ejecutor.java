package finalEstudyLambda;

public class Ejecutor {
	
	public static void main(String[] args) {
		
		Icalculadora calc = (n1,n2)->{
		double resultado = n1+n2;
		System.out.println(resultado);
		};
		
		calc.operation(3, 4);
	}

}
