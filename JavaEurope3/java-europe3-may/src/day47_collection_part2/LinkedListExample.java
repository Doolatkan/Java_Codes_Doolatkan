package day47_collection_part2;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		
		List<Integer> numberList = new LinkedList<>();
		
		numberList.add(10);
		numberList.add(20);
		numberList.add(30);
		numberList.add(30000);
		
		System.out.println(numberList.get(0));
		System.out.println(numberList.get(1));
		
		System.out.println(((LinkedList)numberList).getFirst());
		((LinkedList)numberList).addFirst(1);
		((LinkedList)numberList).addLast(99);
		
		
		
		
		

	}

}
