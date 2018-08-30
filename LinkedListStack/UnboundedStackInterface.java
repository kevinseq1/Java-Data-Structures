package LinkedListStack;

public interface UnboundedStackInterface<T> {

	public void push(T element);
	public void pop() throws StackUnderFlowException;
	public T top() throws StackUnderFlowException;
	public boolean isEmpty();
	
	
}
