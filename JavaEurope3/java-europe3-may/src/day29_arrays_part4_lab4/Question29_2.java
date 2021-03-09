package day29_arrays_part4_lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Question29_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter size of array:");
		int size = scan.nextInt();
		
		while(size<1) {
			System.out.print("Array size cannot be 0 or negative. Try it again:");
			size = scan.nextInt();
		}
		int[] array = new int[size];
		for(int i=0; i<array.length; i++) {
			System.out.print("Enter " + (i+1) + "-element of array:");
			array[i] = scan.nextInt();
		}
		
		System.out.println("Output array:" + Arrays.toString(tenRun(array)));
	}
	
	public static int[] tenRun(int[] a) {

		for(int i=0;i<a.length-1;i++) {
			if(!(a[i]%10==0)) {   //if a[i] is not dividible by 10, pass to next number
				continue;
			}
			else {
				if(!(a[i+1]%10==0)) //if a[i] is dividible by 10, change the next
					a[i+1]=a[i];   //number(a[i+1]=a[i]), only if next number is not
								  //dividible by 10.
				
				else			 //a[i] is dividible by 10 but a[i+1] is also dividible, 
					continue;	//by 10. then pass to next number
					
			}
		}
		return a;


	}

}
