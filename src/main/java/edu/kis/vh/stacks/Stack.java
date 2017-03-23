package edu.kis.vh.stacks;

import edu.kis.vh.stacks.factory.IStack;

public class Stack {
	private IStack stack;
	public Stack(){
	}
	public Stack(IStack stack) {
		super();
		this.stack = stack;
	}

	public void pushElement(int i) {
		stack.pushElement(i);
	}
	public boolean empty() {
		return stack.empty();
	}
	public boolean full() {
		return stack.full();
	}
	public int peek() {
		return stack.peek();
	}
	public int pop() {
		return stack.pop();
	}
}
// Refactor -> Rename , Navigate -> Open Declaration
// Można wymiennie stosować StackList i StackArray w ramach interfejsu 