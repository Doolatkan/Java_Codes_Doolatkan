package bootcamp_day2.ShapesTask;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionPractice {
	
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new LinkedList<>();
		List<Integer> list3 = new Vector<>();
		List<Integer> list4 = new Stack<>();
		
		Set<Integer> set1 = new HashSet<>();
		list1.addAll(list1);
		Set<Integer> set2 = new LinkedHashSet<>();
		Set<Integer> set3 = new TreeSet<>();
	}

}
