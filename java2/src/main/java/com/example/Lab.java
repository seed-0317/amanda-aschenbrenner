package com.example;

import java.util.*;

public class Lab {



	/*
          1. Return the nth fibonacci number
          f(0) = 0
          f(1) = 1
          f(10) = 55
        */

	public static int fibonacci(int n) {

		if (n <= 1) {
			return n;
		} else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}

	/*
	  2. Sort array of integers
	  f([2,4,5,1,3,1]) = [1,1,2,3,4,5]
	  Don't use built-in sort() method... that would be lame.
	*/
	public static int[] sort(int[] array) {

		for (int i = 0; i < array.length-1; i++) {
			int temp;

			for (int x = i + 1; x < array.length; x++) {
				if (array[i] > array[x]) {
					temp = array[i];
					array[i] = array[x];
					array[x] = temp;
				}
			}
		}
		return array;

	}

	/*
              3. Return the factorial of n
              f(0) = 1
              f(1) = 1
              f(3) = 6
            */
	public static int factorial(int n) {
		if (n <= 1) {
			return 1;
		}

		for (int i = 1; i <= 5; i++) {
			n = n * factorial(n - 1);
			break;

		}

		return n;
	}

	/*
	  4. Rotate left
	  Given array, rotate left n times and return array
	  f([1,2,3,4,5], 1) = [2,3,4,5,1]
	  f([1,2,3,4,5], 6) = [2,3,4,5,1]
	  f([1,2,3,4,5], 3) = [4,5,1,2,3]
	*/
	public static int[] rotateLeft(int[] array, int n) {
		for (int t = 0; t < n; t++) {
			int temp = array[0];

			for (int i = 0; i < array.length - 1; i++) { // can also use length for Arrays. Size is for collections ie ArrayList
				array[i] = array[i + 1];// move everything one left
			}
			array[array.length - 1] = temp;
		}
			return array;
	}

	/*
	  5. Balanced Brackets
	  A bracket is any one of the following: (, ), {, }, [, or ]
	  The following are balanced brackets:
	    ()
	    ()()
	    (())
	    ({[]})
	  The following are NOT balanced brackets:
	  (
	  )
	  (()
	  ([)]
	  Return true if balanced
	  Return false if not balanced
	*/
	public static boolean balancedBrackets(String bString) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < bString.length(); i++) {
			char ch = bString.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else if
				((ch == ')') || (ch == '}') || (ch == ']')){

				if (stack.empty()) {
					return false;
				}

				if (((ch == ')') && stack.peek() == '(') || ((ch == '}') && stack.peek() == '{') || ((ch == ']') && stack.peek() == '[')) {
					stack.pop();
				}
			}
			if (stack.empty()) {
				return true;
			}
		}
		return false;
	}
}
