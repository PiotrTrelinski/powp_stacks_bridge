package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

public class Stack {
	private StackList stack;
	public Stack(){
	}
	public Stack(StackList stack) {
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
//nie użyłem żadnej, ale Refactor -> Rename i Navigate -> Open Declaration