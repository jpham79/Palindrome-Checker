package edu.hawaii.ics211;
import java.util.EmptyStackException;
import java.util.Stack;

public class Palindrome {

	Palindrome () {
	}

	public static boolean isPalindrome(String word) {
		Stack<Character> Stack = new Stack<Character>();
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
	
}
