package day47_collection_part2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoopWithIterator {

   public static void main(String[] args) {
		
        List<Integer> nums = new ArrayList<>();
		
		nums.add(50);
		nums.add(543);
		nums.add(1150);
		nums.add(550);
		nums.add(570);
		nums.add(93);
		nums.add(5000);
		nums.add(950);
		
		Iterator<Integer> it = nums.iterator();
		
		//call hasNext() method
		//hasNext() return true if there is still next valu
		//return false when it reaches the end or empty
		
		System.out.println("it.hasNext(): " + it.hasNext());
		System.out.println("it.next(): " + it.next());
		System.out.println("it.next(): " + it.next());
		/*System.out.println("it.next(): " + it.next());
		System.out.println("it.next(): " + it.next());
		System.out.println("it.next(): " + it.next());
		System.out.println("it.next(): " + it.next());
		System.out.println("it.next(): " + it.next());
		System.out.println("it.next(): " + it.next());*/
		System.out.println("it.hasNext(): " + it.hasNext());
		
		System.out.println();
		
		while (it.hasNext()) {
			System.out.print(it.next() + "|");
			
		}
		System.out.println();
		//System.out.print(it.next() + "|");
		
		//What is the difference between for each loop and iterator
	    //we can remove objects while looping
		
		Iterator<Integer> it2 = nums.iterator();
		
		while (it2.hasNext()) {
			int value = it2.next();
			if(value>1000) {
				it2.remove();
			}
			
		}
		
		
		
		List<String> cities=  new ArrayList<>();
		
		cities.add("New York");
		cities.add("Boston");
		cities.add("Virginia");
		cities.add("DC");
		
		for(String city : cities) {
			if(city.equals("Boston")) {
				//cities.remove(city);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
