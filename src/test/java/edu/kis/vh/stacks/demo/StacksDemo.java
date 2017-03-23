package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.StackArray;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;

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
		DefaultStacksFactory factory = new DefaultStacksFactory();

		testStacks(factory);

	}

	/**
	 * @param factory
	 * metoda przyjmująca DefaultStacksFactory jako argument, jej zadaniem jest prestestowanie/prezentacja stosów
	 */
	private static void testStacks(DefaultStacksFactory factory) {
		StackArray[] stacks = { factory.getStandardStack(), factory.getFalseStack(), factory.getFIFOStack(),
				factory.getHanoiStack() };

		for (int i = 1; i < SIZE; i++)
			for (int j = 0; j < 3; j++)
				stacks[j].push(i);

		java.util.Random rn = new java.util.Random();
		for (int i = 1; i < SIZE; i++)
			stacks[3].push(rn.nextInt(20));

		for (int i = 0; i < stacks.length; i++) {
			while (!stacks[i].isEmpty())
				System.out.print(stacks[i].pop() + "  ");
			System.out.println();
		}

		System.out.println(MESSAGE + ((StackHanoi) stacks[3]).reportRejected());
	}

}
