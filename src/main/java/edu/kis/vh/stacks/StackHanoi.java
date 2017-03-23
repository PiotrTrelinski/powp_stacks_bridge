package edu.kis.vh.stacks;

import edu.kis.vh.stacks.impementation.StackArray;

public class StackHanoi extends StackArray {

	private int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	public void pushElement(int in) {
		if (!empty() && in > peek())
			totalRejected++;
		else
			super.pushElement(in);
	}
}