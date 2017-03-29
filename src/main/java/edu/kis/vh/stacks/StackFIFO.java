package edu.kis.vh.stacks;


public class StackFIFO extends Stack {

	public StackFIFO() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Stack temp = new Stack();

	@Override
	public int pop() {
		while (!empty())
			temp.pushElement(super.pop());

		int ret = temp.pop();

		while (!temp.empty())
			pushElement(temp.pop());

		return ret;
	}
}