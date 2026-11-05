//© A+ Computer Science  -  www.apluscompsci.com

public class ListNode<T extends Comparable> implements Linkable<T> {
	private T value;
	private ListNode<T> nextNode;

	public ListNode(T value, ListNode<T> next) {
		this.value = value;
		nextNode = next;
	}

	public T getValue() {
		return value;
	}

	public ListNode<T> getNext() {
	   return nextNode;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public void setNext(Linkable<T> next) {
		nextNode = (ListNode<T>)next;
	}
}