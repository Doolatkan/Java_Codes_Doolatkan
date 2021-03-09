package day47_collection_part2;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<String>();
		
		queue.add("Mike");
		queue.add("Ozzy");
		queue.add("Doolatkan");
		queue.add("Asiya");
		queue.add("Jamal");
		
		System.out.println(queue.toString());
		
		String name = queue.remove();
		
		System.out.println(name);
		
		System.out.println(queue.toString());
		
		//the poll() method is similar to remove() except that it returns null if the queue is empty
		name = queue.poll();
		System.out.println(name);
		
		//get the element at the front of the queue without removing it using peek()
		name = queue.peek();
		System.out.println(name);
		System.out.println(queue.toString());
		
		
		
		
		

	}

}
