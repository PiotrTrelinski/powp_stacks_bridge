package edu.kis.vh.stacks;

public class StackHanoi extends Stack {

	public StackHanoi() {
		super();
		// TODO Auto-generated constructor stub
	}

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