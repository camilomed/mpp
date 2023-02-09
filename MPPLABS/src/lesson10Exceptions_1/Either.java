package lesson10Exceptions_1;

import java.util.Optional;
import java.util.function.Function;

public class Either<L, R> {

    private final L error;
    private final R result;

    private Either(L left, R right) {
        this.error = left;
        this.result = right;
    }

    public static <L,R> Either<L,R> left(L err) {
        return new Either(err, null);
    }

    public static <L,R> Either<L,R> right(R val) {
        return new Either(null, val);
    }

    public Optional<L> getLeft() {
        return Optional.ofNullable(error);
    }

    public Optional<R> getRight() {
        return Optional.ofNullable(result);
    }

    public boolean isLeft() {
        return error != null;
    }

    public boolean isRight() {
        return result != null;
    }

    public <T> Optional<T> mapLeft(Function<? super L, T> mapper) {
        if (isLeft()) {
            return Optional.of(mapper.apply(error));
        }
        return Optional.empty();
    }

    public <T> Optional<T> mapRight(Function<? super R, T> mapper) {
        if (isRight()) {
            return Optional.of(mapper.apply(result));
        }
        return Optional.empty();
    }

    public String toString() {
        if (isLeft()) {
            return "Left(" + error +")";
        }
        return "Right(" + result +")";
    }
}