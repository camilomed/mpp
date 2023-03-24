package ExtraCreditStandarExam3;

public abstract class Department {
	
	public abstract String getName();
	
	private StringQueue queue = new StringQueue();
	public void addMessage(String msg) {
		queue.enqueue(msg);
	}
	public String nextMessage() {
		String str = "";
		try {
			str = queue.dequeue();
		} catch (EmptyQueueException e) {
			//e.printStackTrace();
		}
		return str;
	}
	
	public StringQueue getQueue() {
		return queue;
	}
	
	
}
