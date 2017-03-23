package edu.kis.vh.stacks.impementation;

public interface IStack {

	void pushElement(int i);

	boolean empty();

	boolean full();

	int peek();

	int pop();

}