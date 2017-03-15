package edu.kis.vh.stacks;

public class StackFIFO extends Stack {

	private Stack temp = new Stack();

	@Override
	public int pop() {
		while (!isEmpty())
			temp.push(super.pop());

		int ret = temp.pop();

		while (!temp.isEmpty())
			push(temp.pop());

		return ret;
	}
}
// źle sformatowane wiersze 10-12, 14-16