package edu.kis.vh.stacks.impementation;

class Node {

	public int value;
	public Node prev;
	public Node next;

	public Node(int i) {
		value = i;
	}

}

public class StackList implements IStack {

	private static final int EMPTY = -1;
	private Node last;

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.list.IStack#pushElement(int)
	 */
	@Override
	public void pushElement(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.list.IStack#empty()
	 */
	@Override
	public boolean empty() {
		return last == null;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.list.IStack#full()
	 */
	@Override
	public boolean full() {
		return false;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.list.IStack#peek()
	 */
	@Override
	public int peek() {
		if (empty())
			return EMPTY;
		return last.value;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.list.IStack#pop()
	 */
	@Override
	public int pop() {
		if (empty())
			return EMPTY;
		int ret = last.value;
		last = last.prev;
		return ret;
	}
}
