package ArrayQueue;

public class QueueUnderFlowException extends Exception{

	public QueueUnderFlowException() {
		super();
	}
	
	public QueueUnderFlowException(String message) {
		super(message);
	}
}
