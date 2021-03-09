package day27_arrays_part4;

public class Length {

	public static void main(String[] args) {
		
		int[][] numbers = {
				{1,2,3,4},                //row-0
				{5,6},                    //row-1
				{9,10,11,12,30,50,60}     //row-2
		};
		
		//display the number of rows
		System.out.println("Number of rows is:" + numbers.length);
		
		//display the number of columns in each rows
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println("Number of columns in row " + i + " is " + numbers[i].length);
		}
		
		System.out.println("-----------------------------------------------------------");
		
		for(int i=0; i<numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j]+",");				
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------------------------------");
		
		for(int i=0; i<numbers.length; i++) {
			for (int j : numbers[i]) {
				System.out.print(j+" ");				
			}
			System.out.println();
		}
		
		
		
		
	}

}
