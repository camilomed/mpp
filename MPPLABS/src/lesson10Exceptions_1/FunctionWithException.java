package lesson10Exceptions_1;

@FunctionalInterface
public interface FunctionWithException<T, R> {
	R apply(T t) throws Exception;   // define your functional interface
}
