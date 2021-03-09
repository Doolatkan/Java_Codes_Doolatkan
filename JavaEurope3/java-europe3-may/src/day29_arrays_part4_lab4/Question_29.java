package day29_arrays_part4_lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Question_29 {

	public static void main(String[] args) {
		
		int[] array = {1,10,2,3,20,5,4,40,15,100,6};
		System.out.println("Output:" + Arrays.toString(tenRun(array)));
	}
	
	public static int[] tenRun(int[] arr) {		
		for(int i=0; i<arr.length-1; i++) {			
			if(arr[i]%10==0 && arr[i+1]%10!=0 ) {
				arr[i+1]=arr[i];				
			}else {
				continue;
			}
		}		
		return arr;		
	}
}

	

