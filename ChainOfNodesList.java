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

	public boolean add(int index, E item) {
		checkIndex(index);
		Node<E> node = new Node<E>(item);
		if(index == 0) { // Adding a new head.
			node.next = head;
			head = node;
		} else  { // Adding in the middle.
			Node<E> prev = getNode(index - 1);
			node.next = prev.next;
			prev.next = node;
		} size++;
		return true;
	}

	public E remove(int index) {
		checkIndex(index);
		E oldData;
		if(index == 0) { // Removing the head.
			oldData = head.data;
			head = head.next;
		} else { // Removing in the middle.
			Node<E> prev = getNode(index - 1);
			oldData = prev.next.data;
			prev.next = prev.next.next;

			// Check if we just removed the tail.
			if(prev.next == null) { tail = prev; }
		} size--;
		return oldData;
	}

	public E get(int index) {
		return getNode(index).data;
	}

	public E set(int index, E data) {
		Node<E> node = getNode(index);
		E oldData = node.data;
		node.data = data;
		return oldData;
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
		checkIndex(index);
		Node<E> current = head;
		for(int i = 0; i < index; i++) {
			current = current.next;
		} return current;
	}

	private void checkIndex(int index) {
		if(index < 0) { throw new NoSuchElementException("Index cannot be negative."); }
		else if(index >= size) { throw new NoSuchElementException("Index cannot reference beyond the list."); }
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