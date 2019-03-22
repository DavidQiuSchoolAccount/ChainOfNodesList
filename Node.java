/**
 * A node in a linked list.
 * This node holds an element of type E.
 */
public class Node<E> {
	public E data;
	public Node<E> next;

	public Node(E data) {
		this.data = data;
	}

	// This class has public fields and no getters/setters. This is a deliberate design decision. There is no advantage to one-
	// line wrapper methods such as getData(), setData(), etc., compared to letting applications access the fields directly.
}