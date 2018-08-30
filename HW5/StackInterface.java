package HW5;

public interface StackInterface<T> {

	public void push(T element) throws OverflowException; //Pushes an element into the stack, else throws an exception if the stack is full.
	public void pop() throws UnderflowException; //Removes an element from the stack, else throws an exception if the stack is empty.
	public T top() throws UnderflowException; //Returns the top most element in the stack, else throws and exception if the stack is empty.
	public boolean isEmpty(); //Returns true if the stack is empty, else returns false.
	public boolean isFull(); //Returns true if the stack is full, else returns false.
	
}
