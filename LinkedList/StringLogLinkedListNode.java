package LinkedList;

public class StringLogLinkedListNode {
	
	//Data Members
	private String data; //The data stored in the node.
	private StringLogLinkedListNode nextNode; //The link to the next node.
	
	
	//Constructors
	public StringLogLinkedListNode(String initData) {
		data = initData;
		nextNode = null;
	}


	//Methods
	
	//Returns the data in the node.
	public String getData() {
		return data;
	}

	//Sets the data in the node.
	public void setData(String data) {
		this.data = data;
	}

	//Gets the link to the next node.
	public StringLogLinkedListNode getNextNode() {
		return nextNode;
	}

	//Sets the link to the next node.
	public void setNextNode(StringLogLinkedListNode nextNode) {
		this.nextNode = nextNode;
	}
	
	
	

}
