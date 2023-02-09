package lesson10Exceptions_2;

@FunctionalInterface
public interface FunctionWithException<T, R> {
	R apply(T t) throws Exception;   // define your functional interface
}
