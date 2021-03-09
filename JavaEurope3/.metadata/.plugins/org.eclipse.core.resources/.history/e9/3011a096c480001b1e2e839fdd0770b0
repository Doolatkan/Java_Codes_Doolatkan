package day22_stringManipulation_Lab;

import java.util.Scanner;

public class String_StartsEndsWith {

	public static void main(String[] args) {
		
		String word1 = "ecilpise";
		
		System.out.println(word1.startsWith("e"));
		System.out.println(word1.startsWith("ec"));
		System.out.println(word1.startsWith("ex"));
		
		System.out.println(word1.endsWith("e"));
		System.out.println(word1.endsWith("ipse"));
		System.out.println(word1.endsWith("ese"));
		System.out.println(word1.endsWith("e "));
		
		
		//Mr. => married man
		//Mrs. => marries woman
		//Ms. => some woman
		//Dr. => doctor man or woman
		//No title => unknown status
		
		
		Scanner scan = new Scanner(System.in);
	    System.out.print("Enter title and name:");	
	    String title = scan.nextLine();
	    
	    if(title.startsWith("Mr.")){
	    	System.out.println(title + " married man");
	    }else if(title.startsWith("Mrs.")){
	    	System.out.println(title + " married woman");
	    }else if(title.startsWith("Ms.")){
	    	System.out.println(title + " some woman");
	    }else if(title.startsWith("Dr.")){
	    	System.out.println(title + " doctor man or woman");
	    }else{
	    	System.out.println(title + " unknown status");
	    }
	    
	
		
		

	}

}
