package HW5;

public class ArrayStack<T> implements StackInterface<T> {

	//Data Members
	protected final int capacity = 100;
	protected T[] arrayStack;
	protected int topIndex = -1;
	
	
	//Constructors
	public ArrayStack() {
		arrayStack = (T[]) new Object[capacity];
	}
	
	public ArrayStack(int maxSize) {
		arrayStack = (T[]) new Object[maxSize];
	}

	
	//Methods
	public void push(T element) throws OverflowException {
		if(!isFull()) {
			topIndex++;
			arrayStack[topIndex] = element;
		} else {
			throw new OverflowException("Push operation attempted on a full stack.");
		}
	}

	
	public void pop() throws UnderflowException {
		if(!isEmpty()) {
			arrayStack[topIndex] = null;
			topIndex--;
		} else {
			throw new UnderflowException("Pop operation attempted on an empty stack.");
		}
	}

	
	public T top() throws UnderflowException {
		T topItem = null;
		if(!isEmpty()) {
			topItem = arrayStack[topIndex];
		} else {
			throw new UnderflowException("Top operation attempted on an empty stack.");
		}
		return topItem;
	}

	
	public boolean isEmpty() {
		if(topIndex == -1) {
			return true;
		} else {
			return false;
		}
	}

	
	public boolean isFull() {
		if(topIndex == (arrayStack.length - 1)) {
			return true;
		} else {
			return false;
		}
	}

}
