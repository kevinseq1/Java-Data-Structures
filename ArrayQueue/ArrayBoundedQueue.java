package ArrayQueue;

public class ArrayBoundedQueue<T> implements ArrayBoundedQueueInterface<T> {

	//Data Members
	protected final int DEFCAP = 100;
	protected T[] queue;
	protected int numElements = 0;
	protected int front = 0;
	protected int rear;
	
	//Constructors
	public ArrayBoundedQueue() {
		queue = (T[]) new Object[DEFCAP];
		rear = DEFCAP - 1;
	}
	
	public ArrayBoundedQueue(int maxCap) {
		queue = (T[]) new Object[maxCap];
		rear = maxCap - 1;
	}

	//Methods
	public void enqueue(T newItem) throws QueueOverFlowException {
		if(isFull()){
			throw new QueueOverFlowException("Enqueue attempted on a full queue.");
		} else {
			rear = (rear + 1) % queue.length;
			queue[rear] = newItem;
			numElements += 1;
		}
	}

	
	public T dequeue() throws QueueUnderFlowException {
		if(isEmpty()) {
			throw new QueueUnderFlowException("Dequeue attempted on an empty queue");
		} else {
			T toReturn = queue[front];
			queue[front] = null;
			front = (front + 1) % queue.length;
			numElements -= 1;
			return toReturn;
		}
	}

	
	public boolean isEmpty() {
		return (numElements == 0);
	}

	
	public boolean isFull() {
		return (numElements == queue.length);
	}

}
