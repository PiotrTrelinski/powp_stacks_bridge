package edu.kis.vh.stacks;

public class Stack {
	private StackArray stack;
	public Stack(){
	}
	public int getTotal() {
		return stack.getTotal();
	}
	public void push(int i) {
		stack.push(i);
	}
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	public boolean isFull() {
		return stack.isFull();
	}
	public int top() {
		return stack.top();
	}
	public int pop() {
		return stack.pop();
	}
	public Stack(StackArray stack) {
		super();
		this.stack = stack;
	}
}
