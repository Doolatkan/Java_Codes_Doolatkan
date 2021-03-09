package day27_arrays_part4;

import java.util.Arrays;

public class RaggedArray {

	public static void main(String[] args) {
		
		int[][] array = new int[4][];
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		
        String[][] arr = new String[2][];
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
        boolean[][] arra = new boolean[2][];
		
		System.out.println(arra[0]);
		System.out.println(arra[1]);		
		
		
		array[0] = new int[3];
		array[1] = new int[4];
		array[2] = new int[5];
		array[3] = new int[2];
		
		System.out.println(array[0]);
		
		int[][] array2 = {{0,0,0},{0,0,0,0},{0,0,0,0,0},{0,0}};		
		
		for(int[] i: array) {
			for(int j : i) {
				System.out.print(j+",");
			}
			System.out.println();
		}
		
		int[][] array3 = {{}};
		System.out.println(array3[0]);
	}
	}


