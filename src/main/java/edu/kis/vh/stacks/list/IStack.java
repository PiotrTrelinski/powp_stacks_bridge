package edu.kis.vh.stacks.list;

public interface IStack {

	void pushElement(int i);

	boolean empty();

	boolean full();

	int peek();

	int pop();

}