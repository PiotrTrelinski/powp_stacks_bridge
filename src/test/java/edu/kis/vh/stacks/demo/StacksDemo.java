package edu.kis.vh.stacks.demo;

import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;

class StacksDemo {

	private static final String MESSAGE = "total rejected is ";
	private static final int SIZE = 15;

	public static void main(String[] args) {
		DefaultStacksFactory factory = new DefaultStacksFactory();

		Stack[] stacks = { factory.getStandardStack(), factory.getFalseStack(), factory.getFIFOStack(),
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
// źle sformatowane wiersze 19-27 ; 13 i 31 pominąłem
// alt + strzałki w lewo i w prawo przeskakują między plikami, czasami w obrębie pliku