package LinkedListQueue;

public interface LinkedListUnboundedQueueInterface<T> {

	/*Throws QueueOverFlowException if the queue is full else 
	inserts element at the end of the queue.*/
	public void enqueue(T newItem);

	/*Throws QueueUnderFlowException if the queue is empty else 
	 removes it the front element from the queue and returns it.*/
	public T dequeue() throws QueueUnderFlowException;
	
	//Returns true if the queue is empty else return false.
	public boolean isEmpty();
	
}
