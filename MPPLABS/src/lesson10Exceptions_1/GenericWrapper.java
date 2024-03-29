package lesson10Exceptions_1;

import java.io.File;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GenericWrapper {
	public List<String> getCanonicalPaths(String[] dirs){
		return Stream.of(dirs).map(
			path -> unchecked((String p) -> new File(p).getCanonicalPath()).apply(path))
				//path -> (String p) -> new File(p).getCanonicalPath()
			.map(Object::toString).collect(Collectors.toList());
	}

	public static void main(String[] args){
		String[] localDirs = {"/usr", "//usr", "/etc"};
		List<String> canonicalPaths
			= (new GenericWrapper()).getCanonicalPaths(localDirs);
		System.out.println(canonicalPaths);
	}

	public static <T, R> Function<T,Either> unchecked(FunctionWithException<T,R> f) {
		return x -> {
			try {
				return Either.right(f.apply(x));
			} catch(Exception e) {
				return Either.left(e);
			}
		};
	}
}