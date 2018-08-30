package HW3;

public class LinkedListStack2<T> extends LinkedListStack<T> {
	
	//Print Method in order using recursion
		private void printStack(GenericNode<T> listRef){
				
				if(listRef !=null) {
					System.out.print(" | " + listRef.getData());
					printStack(listRef.getNextNode());
				}
			}
				
			public void printStackOrdered() {
				System.out.print("\nThe Stack contains the following items: ");
				printStack(top);
			}
		
			
		//Print Method in reverse order using recursion
		private void reversePrint(GenericNode<T> listRef){
			
			if(listRef !=null) {
				reversePrint(listRef.getNextNode());
				System.out.print(" | " + listRef.getData());
			}
		}
			
		public void printStackReversed() {
			System.out.print("\nThe Stack in reverse order contains the following items: ");
			reversePrint(top);
		}
}
