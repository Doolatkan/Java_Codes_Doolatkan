package day25_arrays_part2;

import java.util.Arrays;

public class SameArray {

	public static void main(String[] args) {
		
		int[]array1 = {2,4,6,8};
		int[] array2 = array1;
		
		System.out.println("The contents of array1");
		for(int arr1 : array1) {
			System.out.println(arr1);	
		}
				
		System.out.println("The contents of array2");
		for(int arr2 : array2) {
			System.out.println(arr2);	
		}
		
		//change some index value
		array1[0]=200;
		array2[2]=1000;	
		
		
		System.out.println("The contents of array1 after changing");
		for(int arr1 : array1) {
			System.out.println(arr1);	
		}		
		
		System.out.println("The contents of array2 after changing");
		for(int arr2 : array2) {
			System.out.println(arr2);	
		}
		
		//change some index value
				array1[0]=200;
				array2[0]=1000;	
				
				
				System.out.println("The contents of array1 after changing");
				for(int arr1 : array1) {
					System.out.println(arr1);	
				}		
				
				System.out.println("The contents of array2 after changing");
				for(int arr2 : array2) {
					System.out.println(arr2);	
				}
				
				String str1 = "Cybertek";
				String str2 = str1;
				System.out.println(str1);
				System.out.println(str2);
				str2 = "Ccybertek";
				System.out.println(str1);
				System.out.println(str2);
		System.out.println("------------------------------------------------");		
		
	  String[] str = {"Cyberte", "Java", "Study"};
	  String[] strr = str;
	  
	  for(String string : str) {
		  System.out.println(string);
	  }
	
	  for(String string : strr) {
		  System.out.println(string);
	  }
	  
	  System.out.println("------------------------------------------------");
	   str[2] = "testing";
	   strr[0] = "Cybertek";;
	  
	  for(String string : str) {
		  System.out.println(string);
	  }
	
	  for(String string : strr) {
		  System.out.println(string);
	  }
	  
	  int[] numbers = {20,30,50,60,100,70};
	  myArray(numbers);		
	}

	public static int[] myArray(int[] numbers) {
		int[]num=numbers;
		
		return num;
		
	}
	
	

}
