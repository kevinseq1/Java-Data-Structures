package LinkedListStack;

public class LinkedListStack<T> implements UnboundedStackInterface<T> {

	//Data Members
	protected GenericNode<T> top;
	
	//Constructors 
	public LinkedListStack() {
		top = null;
	}

	//Methods
	
	//Inserts an element to the stack.
	public void push(T element) {
		GenericNode<T> newNode = new GenericNode<T>(element);
		newNode.setNextNode(top);
		top = newNode;
	}


	//Throws a stack underflow exception if the stack is empty or else removes the top element from the stack.
	public void pop() throws StackUnderFlowException {
		if(!isEmpty()) {
			top = top.getNextNode();
		} else {
			throw new StackUnderFlowException("Pop operation attempted on an empty stack.");
		}
		
	}

	//Throws a stack underflow exception if the stack is empty or else returns the top element from the stack.
	public T top() throws StackUnderFlowException {
		if(!isEmpty()) {
			return top.getData();
		} else {
			throw new StackUnderFlowException("Top operation attempted on an empty stack.");
		}
	}


	//Checks if the stack is empty.
	public boolean isEmpty() {
		if(top == null) {
			return true;
		} else {
			return false;
		}
	}
	
	//Checks the size of the Linked List.
	public int size() {
		int counter = 0;
		GenericNode<T> currentNode = top;
		while(currentNode != null) {
			counter++;
			currentNode = currentNode.getNextNode();
		}
		return counter;
	}
	
//	//Print Method in order using interation.
//	public String toString() {
//		GenericNode<T> currentNode = top;
//		String result = "\nThe Stack contains the following items: ";
//		for(int i=0; i<size(); i++) {
//			result += " | " +currentNode.getData();
//			currentNode = currentNode.getNextNode();
//		}
//		return result;
//	}
	
	//Print Method in order using recursion
	private void printStack(GenericNode<T> listRef){
			
			if(listRef !=null) {
				System.out.print(" | " + listRef.getData());
				printStack(listRef.getNextNode());
			}
		}
			
		public void printStackOrdered() {
			System.out.print("\nThe Stack contains the following items: ");
			printStack(top);
		}
	
		
	//Print Method in reverse order using recursion
	private void reversePrint(GenericNode<T> listRef){
		
		if(listRef !=null) {
			reversePrint(listRef.getNextNode());
			System.out.print(" | " + listRef.getData());
		}
	}
		
	public void printStackReversed() {
		System.out.print("\nThe Stack in reverse order contains the following items: ");
		reversePrint(top);
	}
	
}
