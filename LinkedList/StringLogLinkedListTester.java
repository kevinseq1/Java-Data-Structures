package LinkedList;

public class StringLogLinkedListTester {

	public static void main(String[] args) {
		
		//One Way
		StringLogLinkedList ll1 = new StringLogLinkedList("Letters");
		ll1.insert("A");
		ll1.insert("B");
		ll1.insert("C");
		ll1.insert("D");
		
		ll1.delete("D");
		ll1.delete("D");
		
		
		
		
		System.out.println(ll1.toString());
		System.out.println("Size of the Linked List " + ll1.getName() + ": " + ll1.size());
		System.out.println("Does the Linked List " + ll1.getName() + " contain: " + ll1.contains("A"));
		System.out.println("Does the Linked List " + ll1.getName() + " contain: " + ll1.contains("F"));
		System.out.println("Is the Linked List " + ll1.getName() + " full: " + ll1.isFull());
		
		
//		//Another Way
//		StringLogLinkedListNode ll2 = new StringLogLinkedListNode("E");
//		ll2.setNextNode(new StringLogLinkedListNode("F"));
//		ll2.getNextNode().setNextNode(new StringLogLinkedListNode("G"));
//	
//		StringLogLinkedListNode currentNode = ll2; 
//		while(currentNode != null) {
//			System.out.println(currentNode.getData());
//			currentNode = currentNode.getNextNode();
//		}

	}

}
