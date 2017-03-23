package edu.kis.vh.stacks.list;

public class StackArray implements IStack {

	private static final int FULL = 11;

	private static final int EMPTY = -1;

	private static final int SIZE = 12;

	private int[] items = new int[SIZE];

	private int total = EMPTY;

	public int getTotal() {
		return total;
	}

	public void pushElement(int i) {
		if (!full())
			items[++total] = i;
	}

	public boolean empty() {
		return total == EMPTY;
	}

	public boolean full() {
		return total == FULL;
	}

	public int peek() {
		if (empty())
			return EMPTY;
		return items[total];
	}

	public int pop() {
		if (empty())
			return EMPTY;
		return items[total--];
	}

}
