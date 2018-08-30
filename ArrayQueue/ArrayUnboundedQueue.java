package ArrayQueue;

public class ArrayUnboundedQueue<T> implements ArrayUnboundedQueueInterface<T> {

	//Data Members
	protected final int DEFCAP = 100;
	protected T[] queue;
	protected int origCap;
	protected int numElements = 0;
	protected int front = 0;
	protected int rear = -1;
	
	//Constructors
	public ArrayUnboundedQueue() {
		queue = (T[]) new Object[DEFCAP];
		rear = DEFCAP - 1;
		origCap = DEFCAP;
	}
	
	public ArrayUnboundedQueue(int origCap) {
		queue = (T[]) new Object[origCap];
		rear = origCap - 1;
		this.origCap = origCap;
	}
	
	//Methods
	private void enlarge() {
		T[] larger = (T[]) new Object[queue.length + origCap];
		int currSmaller = front;
		for(int currLarger = 0; currLarger < numElements; currLarger++) {
			currSmaller = (currSmaller + 1) % queue.length;
		}
		queue = larger;
		front = 0;
		rear = numElements - 1;
	}
	
	
	public void enqueue(T newItem){
		if(numElements == queue.length) {
			enlarge();
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

}
