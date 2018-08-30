package LinkedListStack;

public class GenericNode<T> {

	//Data Members
	private T data;
	private GenericNode<T> nextNode;
	
	//Constructors
	public GenericNode() {
		nextNode = null;
	}
	
	
	public GenericNode(T initData) {
		data = initData;
		nextNode = null;
	}

	//Methods
	
	//Gets the data of the node.
	public T getData() {
		return data;
	}

	//Sets the data of the node.
	public void setData(T data) {
		this.data = data;
	}

	//Gets the next node.
	public GenericNode<T> getNextNode() {
		return nextNode;
	}

	//Sets the next node.
	public void setNextNode(GenericNode<T> nextNode) {
		this.nextNode = nextNode;
	}
	
	
}
