package LinkedList;

public interface StringLogInterface {
	
	public boolean contains(String targetItem);
	public void insert(String newItem);
	public boolean delete(String targetItem);
	public boolean isFull();
	public int size();
	public void clear();
	public String getName();
	public String toString();
	
}
