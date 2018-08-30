package LinkedList;

public class StringLogLinkedList implements StringLogInterface {
	
	//Data Members
	private String name; //Name of the Linked List.
	private StringLogLinkedListNode head; //Head of the linked list of type StringLogLinkedListNode Class.
	private int size; //Sized of the Linked List.

	//Constructors
	public StringLogLinkedList(String initName) {
		name = initName;
		head = null;
		size = 0;
	}

	//Methods
	
	//Checks to see of the Linked List contains the item.
	public boolean contains(String targetItem) {
		StringLogLinkedListNode currentNode = head;
		while(currentNode != null) {
			if(targetItem.equalsIgnoreCase(currentNode.getData())) {
				return true;
			}
			currentNode = currentNode.getNextNode();
		}
		return false;
	}

	
	//Inserts the new item in the from of the Linked List.
	public void insert(String newItem) {
		if(!contains(newItem)) {
			if(head == null) {
				head = new StringLogLinkedListNode(newItem);
			} else {
				StringLogLinkedListNode temp = new StringLogLinkedListNode(newItem);
				temp.setNextNode(head);
				head = temp;
			}
			size++;
		} else {
			System.out.println("Item already inserted please try a different Item");
		}
	}

	
	//Deletes an element from the Linked List.
	public boolean delete(String targetItem) {
		StringLogLinkedListNode currentNode = head;
		StringLogLinkedListNode p = head.getNextNode();
		StringLogLinkedListNode q = head;
		
		if(contains(targetItem)) {
			if(q.getData() == targetItem) {
				head = p;
			} else {
				while(p.getData() != targetItem) {
					p = p.getNextNode();
					q = q.getNextNode();
				}
				if(p.getNextNode() == null) {
					q.setNextNode(null);
				} else {
					q.setNextNode(p.getNextNode());
				}
			}
		}
		return false;
	}
	


	//Checks if the Linked List is full.
	public boolean isFull() {
		return false;
	}

	//Checks the size of the Linked List.
	public int size() {
		int counter = 0;
		StringLogLinkedListNode currentNode = head;
		while(currentNode != null) {
			counter++;
			currentNode = currentNode.getNextNode();
		}
		return counter;
	}

	//Clears the Linked List.
	public void clear() {
		head = null;
		size = 0;
	}

	//Gets the name of the Linked List.
	public String getName() {
		return name;
	}
	
	//Helps to print of the items in the Linked List.
	public String toString() {
		String result = "";
		StringLogLinkedListNode currentNode = head;
		while(currentNode != null) {
			result = result + currentNode.getData() + " ";
			currentNode = currentNode.getNextNode();
		}
		return result;
	}

}

