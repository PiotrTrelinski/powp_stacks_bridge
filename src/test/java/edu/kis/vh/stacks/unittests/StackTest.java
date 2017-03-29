package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.factory.IStack;
import edu.kis.vh.stacks.impementation.StackArray;

public class StackTest {
	
	@Test
	public void testPush() {
		Stack stackObj = new Stack(new StackArray());
		int testValue = 4;
		stackObj.pushElement(testValue);
		
		int result = stackObj.peek();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testIsEmpty() {
		Stack stackObj = new Stack(new StackArray());
		boolean result = stackObj.empty();		
		Assert.assertEquals(true, result);
		
		stackObj.pushElement(888);
		
		result = stackObj.empty();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		Stack stackObj = new Stack(new StackArray());
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY - 1; i++) {
			boolean result = stackObj.full();		
			Assert.assertEquals(false, result);
			stackObj.pushElement(888);
		}
		
		boolean result = stackObj.full();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testTop() {
		Stack stackObj = new Stack(new StackArray());
		final int EMPTY_STACK_VALUE = IStack.EMPTY;
		
		int result = stackObj.peek();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
		
		int testValue = 4;
		stackObj.pushElement(testValue);
		
		result = stackObj.peek();
		Assert.assertEquals(testValue, result);
		result = stackObj.peek();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testPop() {
		Stack stackObj = new Stack(new StackArray());
		final int EMPTY_STACK_VALUE = IStack.EMPTY;
		
		int result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
		
		int testValue = 4;
		stackObj.pushElement(testValue);
		
		result = stackObj.pop();
		Assert.assertEquals(testValue, result);
		result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

}
