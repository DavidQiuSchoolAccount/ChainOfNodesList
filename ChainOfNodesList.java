import java.util.*;

/**
 * An implementation of a list data structure, backed by a linked list.
 */
public class ChainOfNodesList<E> implements Iterable<E> {
	private Node<E> head;
	private Node<E> tail;
	private int size;

	public boolean add(E item) {
		Node<E> node = new Node<E>(item);
		if(head == null) { head = node; }
		if(tail != null) { tail.next = node; }
		tail = node;
		size++;
		return true;
	}

	public E get(int index) {
		return getNode(index).data;
	}

	public void set(int index, E data) {
		getNode(index).data = data;
	}

	public ChainOfNodesIterator iterator() {
		return new ChainOfNodesIterator();
	}

	public int size() {
		return size;
	}

	public void clear() {
		head = null;
		tail = null;
		size = 0;
	}

	public String toString() {
		String result = "[";
		for(E item : this) {
			result += item + ", ";
		}

		if(result.endsWith(", ")) { result = result.substring(0, result.length() - 2); }
		return result + "]";
	}

	private Node<E> getNode(int index) {
		if(index < 0) { throw new NoSuchElementException("Index cannot be negative."); }
		else if(index >= size) { throw new NoSuchElementException("Index cannot be greater than list size."); }

		Node<E> current = head;
		for(int i = 0; i < index; i++) {
			current = current.next;
		} return current;
	}

	public class ChainOfNodesIterator implements Iterator<E> {
		private Node<E> current;

		public ChainOfNodesIterator() {
			current = head;
		}

		public boolean hasNext() {
			return current != null;
		}

		public E next() {
			if(!hasNext()) { throw new IllegalStateException("No more elements."); }
			E result = current.data;
			current = current.next;
			return result;
		}
	}
}