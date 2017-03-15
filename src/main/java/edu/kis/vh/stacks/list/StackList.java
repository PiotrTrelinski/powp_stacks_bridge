package edu.kis.vh.stacks.list;

final class StackList {

	private static final int EMPTY = -1;
	private Node last;
	private int i;

	public void pushElement(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	private boolean empty() {
		return last == null;
	}

	public boolean full() {
		return false;
	}

	public int peek() {
		if (empty())
			return EMPTY;
		return last.getValue();
	}

	public int pop() {
		if (empty())
			return EMPTY;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

	public int getI() {
		return i;
	}

}
//żadnych zmian
