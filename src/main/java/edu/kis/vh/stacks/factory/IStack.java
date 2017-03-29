package edu.kis.vh.stacks.factory;

public interface IStack {

	int EMPTY = 0;

	void pushElement(int i);

	boolean empty();

	boolean full();

	int peek();

	int pop();

}

//Wydzielenie stałej pomogło, wystarczyło w tym miejsu zmienić