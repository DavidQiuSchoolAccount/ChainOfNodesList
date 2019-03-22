import java.util.*;

/**
 * An implementation of a list data structure, backed by a linked list.
 */
public class ChainOfNodesList<E> {
	private Node<E> head;
	private Node<E> tail;
	private int size = 0;

	public boolean add(E item) {
		Node<E> node = new Node<E>(item);
		if(head == null) { head = node; }
		if(tail != null) { tail.next = node; }
		tail = node;
		size++;
		return true;
	}

	public E get(int index) {
		if(index < 0) { throw new NoSuchElementException("Index cannot be negative."); }
		else if(index >= size) { throw new NoSuchElementException("Index cannot be greater than list size."); }

		Node<E> current = head;
		for(int i = 0; i < index; i++) {
			current = current.next;
		} return current.data;
	}

	public int size() {
		return size;
	}
}