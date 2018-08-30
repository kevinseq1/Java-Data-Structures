package LinkedListQueue;

import LinkedListStack.GenericNode;

public class LinkedListUnboundedQueue<T> implements LinkedListUnboundedQueueInterface<T> {

	//Data Members
	protected GenericNode<T> front;
	protected GenericNode<T> rear;
	
	//Constructors
	public LinkedListUnboundedQueue(){
		front = null;
		rear = null;
	}

	//Methods
	public void enqueue(T newItem) {
		GenericNode<T> newNode = new GenericNode<>(newItem);
		if(rear == null) {
			front = newNode;
		} else {
			rear.setNextNode(newNode);
			rear = newNode;
		}
	}

	
	public T dequeue() throws QueueUnderFlowException {
		if(isEmpty()) {
			throw new QueueUnderFlowException("Dequeue attempted on empty queue.");
		} else {
			 T element;
			element = front.getData();
			front = front.getNextNode();
			if (front == null) {
				rear = null;
			}
			return element;
		}
	}

	
	public boolean isEmpty() {
		return (front == null);
	}

}
