package edu.kis.vh.stacks;

import edu.kis.vh.stacks.factory.IStack;
import edu.kis.vh.stacks.impementation.StackList;

public class StackFIFO extends Stack {

	private IStack temp = new StackList();
	public StackFIFO() {
		super();
	}
	public StackFIFO(IStack stack) {
		super(stack);
		temp = stack;
	}


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
//będzie to wydajniejsze gdyż lista nie ma ograniczeń tablicy