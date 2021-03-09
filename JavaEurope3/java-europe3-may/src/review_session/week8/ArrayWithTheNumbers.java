package review_session.week8;

public class ArrayWithTheNumbers {

	public static void main(String[] args) {
		
		//declare numsArray with 5 numbers and assign value to each index
		int[] numsArray = new int[5];
		numsArray[0]=123;
		numsArray[1]=345;
		numsArray[2]=13;
		numsArray[3]=10;
		numsArray[4]= numsArray[0] + numsArray[1];
		
		//declare and assign in same statement		
		int[] numsArray2 = {123,345,13,10,468};		
		
		//declare and assign values in same statement using new keyword		
		int[] numsArray3 = new int[] {123,345,13,10,468};
		
		//print last 
		System.out.println("last element:" + numsArray[numsArray.length-1]);
		
		
		System.out.println("-----------------------------------------------");
		//print the number if it is more than 100
		for(int i=0; i<numsArray.length; i++) {
			
			if(numsArray[i]>100) {
				System.out.println(numsArray[i]);
			}
		}
		
		System.out.println("-----------------------------------------------");
		//print array items in reverse in same line
        for(int i = numsArray.length-1; i>=0; i--) {			
				System.out.println(numsArray[i]);			
		}
		

	}

}
