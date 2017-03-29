package edu.kis.vh.stacks;

import edu.kis.vh.stacks.factory.IStack;

public class StackHanoi extends Stack {

	public StackHanoi() {
		super();
	}
	public StackHanoi(IStack stack) {
		super(stack);
	}
	private int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}
    @Override
	public void pushElement(int in) {
		if (!empty() && in > peek())
			totalRejected++;
		else
			super.pushElement(in);
	}
}