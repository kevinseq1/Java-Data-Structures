package HW5;

public class ArrayQueue<T> implements QueueInterface<T> {

	//Data Members
	protected final int DEFCAP = 100;
	protected T[] arrayQueue;
	protected int numElements = 0;
	protected int front = 0;
	protected int rear;
	
	//Constructors
	public ArrayQueue() {
		arrayQueue = (T[]) new Object[DEFCAP];
		rear = DEFCAP - 1;
	}
	
	public ArrayQueue(int maxSize) {
		arrayQueue = (T[]) new Object[maxSize];
		rear = maxSize - 1;
	}

	//Method
	public void enqueue(T newItem) throws OverflowException {
		if(isFull()){
			throw new OverflowException("Enqueue attempted on a full queue.");
		} else {
			rear = (rear + 1) % arrayQueue.length;
			arrayQueue[rear] = newItem;
			numElements += 1;
		}
	}


	public T dequeue() throws UnderflowException {
		if(isEmpty()) {
			throw new UnderflowException("Dequeue attempted on an empty queue");
		} else {
			T toReturn = arrayQueue[front];
			arrayQueue[front] = null;
			front = (front + 1) % arrayQueue.length;
			numElements -= 1;
			return toReturn;
		}
	}


	public boolean isEmpty() {
		return (numElements == 0);
	}


	public boolean isFull() {
		return (numElements == arrayQueue.length);
	}

}
