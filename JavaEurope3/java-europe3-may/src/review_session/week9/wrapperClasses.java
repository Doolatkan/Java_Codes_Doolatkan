package review_session.week9;

public class wrapperClasses {

	public static void main(String[] args) {
		
		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean("true");
		Boolean b3 = Boolean.valueOf(true);// java 12 preferred
		Boolean b4 = Boolean.valueOf("true");
		
		Character c1 = new Character('a');
		Character c2 = Character.valueOf('b');
	
		Integer i1 = new Integer(1000);
		Integer i2 = Integer.valueOf(2000);
		Integer i3 = Integer.valueOf("3000");
		
		Integer num = new Integer(10);
		System.out.println(num.sum(num, 20));
		System.out.println(Integer.sum(12, 25));
		System.out.println(Integer.max(10, 20));
		System.out.println(Integer.min(10, 20));
		
		//compare
		/*
		 if first is larger than secont -> 1
		 equals ->0
		 second is larger than first -> -1
		 */
		System.out.println(Integer.compare(10, 15));
		
		//Convert a String into int
		String countStr = "3456";
	    int intCount = Integer.parseInt(countStr);
	    System.out.println(intCount);
	    
	    int intCount2 = Integer.valueOf(countStr);
	    System.out.println(intCount2);
	    
	    //
		
		
		
		
		
		

	}

}
