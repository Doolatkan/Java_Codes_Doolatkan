package day29_arrays_part4_lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Question29 {

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
	
	public static int[] tenRun(int[] arr) {
		
		int tenMultiple = 0;
		boolean flag = false;
		
		for(int i=0; i<arr.length; i++) {
			
			if(flag==false) {
			  if(arr[i]%10!=0) {
				arr[i]=arr[i];
			  }else {
				  flag=true;
			  }
			}
			
		   if(flag) {
			   if(arr[i]%10==0) {
				   tenMultiple=arr[i];
				   arr[i]=arr[i];
			   }else {
				   arr[i]=tenMultiple;
			   }
			}
		}
		return arr;
	}

}
