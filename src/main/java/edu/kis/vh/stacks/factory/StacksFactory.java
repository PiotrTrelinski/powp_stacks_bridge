package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;

abstract interface StacksFactory {

	public Stack getStandardStack();

	public Stack getFalseStack();

	public StackFIFO getFIFOStack();

	public StackHanoi getHanoiStack();

}
// źle sformatowane wiersze : 7-17