package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.ArrayStacksFactory;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;
import edu.kis.vh.stacks.factory.IStacksFactory;
import edu.kis.vh.stacks.factory.ListStacksFactory;

/**
 * @author -
 *	Klasa testująca/prezentująca działanie stosów
 */
/**
 * @author -
 *
 */
class StacksDemo {

	/**
	 * pole MESSAGE, ustawione jako stała, używane w metodzie testStacks do wyświetlania wiadomości 
	 */
	private static final String MESSAGE = "total rejected is ";
	
	/**
	 * stała wielkość stosu
	 */
	private static final int SIZE = 15;

	/**
	 * @param args
	 * inicjalizacja DefaultStacksFactory i przekazanie obiektu do metody testStacks
	 */
	public static void main(String[] args) {
		DefaultStacksFactory defaultStacksFactory = new DefaultStacksFactory();
		ArrayStacksFactory arrayStacksFactory = new ArrayStacksFactory();
		ListStacksFactory listStacksFactory = new ListStacksFactory();
		
		testStacks(defaultStacksFactory);
		testStacks(arrayStacksFactory);
		testStacks(listStacksFactory);

	}

	/**
	 * @param factory
	 * metoda przyjmująca DefaultStacksFactory jako argument, jej zadaniem jest prestestowanie/prezentacja stosów
	 */
	private static void testStacks(IStacksFactory factory) {
		Stack[] stacks = { factory.getStandardStack(), factory.getFalseStack(), factory.getFIFOStack(),
				factory.getHanoiStack() };

		for (int i = 1; i < SIZE; i++)
			for (int j = 0; j < 3; j++)
				stacks[j].pushElement(i);

		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < SIZE; i++)
			stacks[3].pushElement(rn.nextInt(20));

		for (int i = 0; i < stacks.length; i++) {
			while (!stacks[i].empty())
				System.out.print(stacks[i].pop() + "  ");
			System.out.println();
		}

		System.out.println(MESSAGE + ((StackHanoi) stacks[3]).reportRejected());
	}

}
