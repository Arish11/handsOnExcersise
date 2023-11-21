package collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> myStack = new Stack<Integer>();
		myStack.push(16);
		myStack.push(41);
		myStack.push(11);
		myStack.push(13);
		System.out.println("Elements in stack are \n"+myStack);
		System.out.println("Element at top of stack is \n"+myStack.peek());
		System.out.println("Poping the stack\n"+myStack.pop());
		System.out.println("Now the top of stack is\n"+myStack.peek());
	}

}
