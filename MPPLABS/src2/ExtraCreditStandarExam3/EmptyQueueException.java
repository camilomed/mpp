package ExtraCreditStandarExam3;

public class EmptyQueueException extends Exception{

	public EmptyQueueException() {
		super();
	}

	public EmptyQueueException(String msg) {
		super(msg);
	}

	public EmptyQueueException(Throwable t) {
		super(t);
	}

	private static final long serialVersionUID = 8808212181600441639L;
}
