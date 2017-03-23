package edu.kis.vh.stacks.factory;

import edu.kis.vh.stacks.factory.StacksFactory;
import edu.kis.vh.stacks.StackArray;
import edu.kis.vh.stacks.StackFIFO;
import edu.kis.vh.stacks.StackHanoi;

public class DefaultStacksFactory implements StacksFactory {

	@Override
	public StackArray getStandardStack() {
		return new StackArray();
	}

	@Override
	public StackArray getFalseStack() {
		return new StackArray();
	}

	@Override
	public StackFIFO getFIFOStack() {
		return new StackFIFO();
	}

	@Override
	public StackHanoi getHanoiStack() {
		return new StackHanoi();
	}

}
