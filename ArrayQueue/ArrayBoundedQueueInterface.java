package ArrayQueue;

public interface ArrayBoundedQueueInterface<T>  {
	
	/*Throws QueueOverFlowException if the queue is full else 
	inserts element at the end of the queue.*/
	public void enqueue(T newItem) throws QueueOverFlowException;

	/*Throws QueueUnderFlowException if the queue is empty else 
	 removes it the front element from the queue and returns it.*/
	public T dequeue() throws QueueUnderFlowException;
	
	//Returns true if the queue is empty else return false.
	public boolean isEmpty();
	
	//Returns true if the queue is full else return false.
	public boolean isFull();
	
}
