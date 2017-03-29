package edu.kis.vh.stacks;

import edu.kis.vh.stacks.impementation.StackList;

public class StackFIFO extends Stack {

	public StackFIFO() {
		super();
		// TODO Auto-generated constructor stub
	}

	private StackList temp = new StackList();

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