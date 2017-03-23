package edu.kis.vh.stacks;

public class StackArray {

	private static final int FULL = 11;

	private static final int EMPTY = -1;

	private static final int SIZE = 12;

	private int[] items = new int[SIZE];

	private int total = EMPTY;

	public int getTotal() {
		return total;
	}

	public void push(int i) {
		if (!isFull())
			items[++total] = i;
	}

	public boolean isEmpty() {
		return total == EMPTY;
	}

	public boolean isFull() {
		return total == FULL;
	}

	public int top() {
		if (isEmpty())
			return EMPTY;
		return items[total];
	}

	public int pop() {
		if (isEmpty())
			return EMPTY;
		return items[total--];
	}

}
