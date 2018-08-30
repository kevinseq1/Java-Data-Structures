package ArrayStack;

public interface BoundedStackInterface<T> {

	public void push(T element) throws StackOverFlowException;
	public void pop() throws StackUnderFlowException;
	public T top() throws StackUnderFlowException;
	public boolean isEmpty();
	public boolean isFull();
	
}
