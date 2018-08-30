package HW2;

public interface HW2ArrayStackInterface {
	
	public void push(String element) throws StackOverFlowException;
	public void pop() throws StackUnderFlowException;
	public String top() throws StackUnderFlowException;
	public boolean isEmpty();
	public boolean isFull();
	public int size();
}
