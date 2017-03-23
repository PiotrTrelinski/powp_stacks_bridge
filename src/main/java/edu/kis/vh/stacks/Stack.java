package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.IStack;

public class Stack {
	private IStack stack;
	public Stack(){
	}
	public Stack(IStack stack) {
		super();
		this.stack = stack;
	}

	public void push(int i) {
		stack.pushElement(i);
	}
	public boolean isEmpty() {
		return stack.empty();
	}
	public boolean isFull() {
		return stack.full();
	}
	public int top() {
		return stack.peek();
	}
	public int pop() {
		return stack.pop();
	}
}
