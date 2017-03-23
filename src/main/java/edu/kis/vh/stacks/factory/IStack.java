package edu.kis.vh.stacks.factory;

public interface IStack {

	int EMPTY = -1;

	void pushElement(int i);

	boolean empty();

	boolean full();

	int peek();

	int pop();

}