package HW5;


public interface QueueInterface<T> {

	public void enqueue(T newItem) throws OverflowException; //Inserts an element in the queue, else throws an exception if the queue is full.
	public T dequeue() throws UnderflowException; //Removes an element from the queue, else throws an exception if the queue is empty.
	public boolean isEmpty(); //Returns true if the queue is empty, else returns false.
	public boolean isFull(); //Returns true if the queue is full, else returns false.
	
}
