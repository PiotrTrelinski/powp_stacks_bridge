package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.StackArray;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;

abstract interface StacksFactory {

	public StackArray getStandardStack();

	public StackArray getFalseStack();

	public StackFIFO getFIFOStack();

	public StackHanoi getHanoiStack();

}
