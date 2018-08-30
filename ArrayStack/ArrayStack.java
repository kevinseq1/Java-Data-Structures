package ArrayStack;

public class ArrayStack<T> implements BoundedStackInterface<T> {

	//Data Members 
	protected final int capacity = 100; //Size of the array.
	protected T[] arrayStack; //Array of type T.(T is whatever type the user specifies.)
	protected int topIndex = -1; //The top index of the stack is set to -1 because the stack is empty.
	
	//Constructors
	@SuppressWarnings("unchecked")
	public ArrayStack() {
		arrayStack = (T[]) new Object[capacity];
	}
	
	@SuppressWarnings("unchecked")
	public ArrayStack(int maxSize) {
		arrayStack = (T[]) new Object[maxSize];
	}

	//Methods 
	//Inserts the element in the stack and throws a stack overflow exception if the stack is full.
	public void push(T element) throws StackOverFlowException {
		if(!isFull()) {
			topIndex++;
			arrayStack[topIndex] = element;
		} else {
			throw new StackOverFlowException("Push operation attemped on a full stack");
		}
	}

	//Deletes an element from the stack and throws a stack underflow exception if the stack is empty.
	public void pop() throws StackUnderFlowException {
		if(!isEmpty()) {
			arrayStack[topIndex] = null;
			topIndex--;
		} else {
			throw new StackUnderFlowException("Pop operation attemped on an empty stack");
		}
	}

	//Gives the location of the top most element and throws a stack underflow exception if the stack is empty.
	public T top() throws StackUnderFlowException {
		T topItem = null;
		if(!isEmpty()) {
			topItem = arrayStack[topIndex];
		} else {
			throw new StackUnderFlowException("Top operation attempted on an empty stack");
		}
		return topItem;
	}

	//Checks if the stack is empty.
	public boolean isEmpty() {
		if(topIndex == -1) {
			return true;
		} else {
			return false;
		}
	}

	//Checks if the stack is full.
	public boolean isFull() {
		if(topIndex == (arrayStack.length - 1)) {
			return true;
		} else {
			return false;
		}
	}

}
