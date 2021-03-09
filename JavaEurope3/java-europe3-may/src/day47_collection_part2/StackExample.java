package day47_collection_part2;

import java.util.Stack;
import java.util.Vector;

public class StackExample {

	public static void main(String[] args) {
		
		Vector<Integer> numStack = new Stack<>();
		
		numStack.add(50);
		numStack.add(70);
		numStack.add(500);
		numStack.add(55);
		numStack.add(75);
		
		System.out.println(numStack.toString());
		
		//check value on top of stack
		
		System.out.println(((Stack)numStack).peek());

		//read value on top of stack then remove it
		
		((Stack)numStack).pop();
		System.out.println(numStack.toString());
		
		System.out.println(((Stack)numStack).peek());
		
		System.out.println(numStack.get(0));
		
		
		
	}

}
