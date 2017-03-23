package edu.kis.vh.stacks.list;

class Node {

	public int value;
	public Node prev;
	public Node next;

	public Node(int i) {
		value = i;
	}

}

public class StackList {

	private static final int EMPTY = -1;
	private Node last;

	public void pushElement(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	public boolean empty() {
		return last == null;
	}

	public boolean full() {
		return false;
	}

	public int peek() {
		if (empty())
			return EMPTY;
		return last.value;
	}

	public int pop() {
		if (empty())
			return EMPTY;
		int ret = last.value;
		last = last.prev;
		return ret;
	}
}
