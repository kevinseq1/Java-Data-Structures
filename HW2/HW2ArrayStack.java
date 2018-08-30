package HW2;

public class HW2ArrayStack implements HW2ArrayStackInterface {
	
	//Data Members 
	protected String[] stack;
	protected int topIndex = -1;
	
	//Constructors
	public HW2ArrayStack(int size) {
		stack = new String[size];
	}

	//Methods
	
	//Inserts an element in the stack and throws a stack overflow exception if the stack is full.
	public void push(String element) throws StackOverFlowException {
		if(!isFull()) {
			topIndex++;
			stack[topIndex] = element;
		} else {
			throw new StackOverFlowException("Push operation attempted on a full stack.");
		}
		
	}

	//Deletes the top most element from the stack and throws a stack underflow exception if the stack is empty.
	public void pop() throws StackUnderFlowException {
		if(!isEmpty()) {
			stack[topIndex] = null;
			topIndex--;
		} else {
			throw new StackUnderFlowException("Pop operation attempted on an empty stack.");
		}
		
	}

	//Returns the top most element of the stack.
	public String top() throws StackUnderFlowException {
		String topItem = null;
		if(!isEmpty()) {
			topItem = stack[topIndex];
		} else {
			throw new StackUnderFlowException("Top operation attempted on an empty stack.");
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
		if(topIndex == (stack.length - 1)) {
			return true;
		} else {
			return false;
		}
	}
	
	//Returns the size of the stack.
	public int size() {
		return topIndex + 1;
	}
	
	//Helps to print out the stack.
	public String toString() {
		String result = "";
		for(int i=0; i<stack.length; i++) {
			result = result + stack[i] + " ";
		}
		return result;
	}

	
	
	

}
