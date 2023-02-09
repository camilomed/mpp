package lesson10_4;
import java.util.function.Function;

@FunctionalInterface
public interface FunctionWithException<T, R> {
	R apply(T t) throws Exception;
	
//	void print();
	public static <T,R> Function<T,R> unchecked(FunctionWithException<T,R> f) {
		return x -> {	
			try {
				return f.apply(x);
			} catch(Exception e) {
				throw new RuntimeException(e);
			}
		};
	}
}
