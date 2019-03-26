/**
 * A node in a ChainOfNodesList.
 * This node holds an element of type E.
 */
public class Node<E> {
	public E data;
	public Node<E> next;

	/**
	 * Constructs a new node.
	 * @param data The data object contained in this node.
	 */
	public Node(E data) {
		this.data = data;
	}

	/**
	 * Returns the data object as a String.
	 */
	public String toString() {
		return data.toString();
	}

	// This class has public fields and no getters/setters. This is a deliberate design decision. There is no
	// advantage to one-line wrapper methods such as getData(), setData(), etc., compared to letting applications
	// access the fields directly.
}