package edu.kis.vh.stacks;

import edu.kis.vh.stacks.impementation.StackArray;

public class StackFIFO extends StackArray {

	private StackArray temp = new StackArray();

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