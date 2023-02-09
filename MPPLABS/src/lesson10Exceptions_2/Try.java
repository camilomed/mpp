package lesson10Exceptions_2;

abstract class Try<T> {
    public abstract boolean isSuccess();
    public abstract boolean isFailure();
    public abstract T getValue();
    public abstract Exception getException();
}

class Success<T> extends Try {

    private T value;

    public Success(T i) {
        this.value = i;
    }

    @Override
    public boolean isSuccess() {
        return true;
    }

    @Override
    public boolean isFailure() {
        return false;
    }

    @Override
    public T getValue() {
        return this.value;
    }

    @Override
    public Exception getException() {
        return null;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}

class Failure extends Try {

    public Exception excp;

    public Failure(Exception e) {
        this.excp = e;
    }

    @Override
    public boolean isSuccess() {
        return false;
    }

    @Override
    public boolean isFailure() {
        return true;
    }

    @Override
    public Integer getValue() {
        return null;
    }

    @Override
    public Exception getException() {
        return this.excp;
    }

    @Override
    public String toString() {
        return excp.toString();
    }
}