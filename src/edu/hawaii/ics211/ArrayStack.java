package edu.hawaii.ics211;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack<E> implements Stack211<E> {
	
	private E[] data;
	private int top;
	
	public ArrayStack() {
		this.data =(E[]) new Object[10];
		this.top = 0;
	}
	
	public static boolean isPalindrome(String word) {
		ArrayStack<Character> Stack = new ArrayStack<Character>();
		for (int i = 0; i<word.length(); i++) {
			Stack.push(word.charAt(i));
		}
		for (int i = 0; i<word.length(); i++) {
			if (!Stack.pop().equals(word.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	
	@Override
	public boolean empty() {
		return top == 0;
	}

	@Override
	public E peek() {
		if (top == 0) {
			throw new EmptyStackException();
		}
		return data[top-1];
	}

	@Override
	public E pop() {
		if (top == 0) {
			throw new EmptyStackException();
		}
		return data[--top];
	}

	@Override
	public E push(E item) {
		if (top == data.length) {
			reallocate();
		}
		data[top++] = item;
		return item;
	}
	
	public void reallocate() {
		int capacity = data.length*2;
		data = Arrays.copyOf(data, capacity);
	}
}
