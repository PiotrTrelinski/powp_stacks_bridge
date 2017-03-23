package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.list.StackArray;

abstract interface IStacksFactory {

	public StackArray getStandardStack();

	public StackArray getFalseStack();

	public StackFIFO getFIFOStack();

	public StackHanoi getHanoiStack();

}
