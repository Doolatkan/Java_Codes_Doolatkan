package day26_arrays_part3;

import java.util.Arrays;

public class Array2D {

	public static void main(String[] args) {
		
		int[][] scores = new int[3][4];
		System.out.println("         int[][] scores = new int[3][4];  - in memory          ");
		System.out.println();
		scores[0][0]=0;
		scores[0][1]=1;
		scores[0][scores.length-1]=4;
		scores[0][3]=0;
		
		scores[1][0]=8;
		scores[1][1]=0;
		scores[1][2]=0;
		scores[1][3]=0;
		
		scores[2][0]=0;
		scores[2][1]=0;
		scores[2][2]=0;
		scores[2][3]=0;	
		
		
		System.out.println("                                 --------------------------");		
		System.out.print("                "+scores[0]);
		System.out.print("       |  "+scores[0][0]);
		System.out.print("  |  "+scores[0][1]);
		System.out.print("  |  "+scores[0][2]);
		System.out.println("  |  "+scores[0][3]);
		System.out.println("                                 --------------------------");
		System.out.print(scores + ":");
		System.out.print("   "+scores[1]);
		System.out.print("       |  "+scores[1][0]);
		System.out.print("  |  "+scores[1][1]);
		System.out.print("  |  "+scores[1][2]);
		System.out.println("  |  "+scores[1][3]);
		System.out.println("                                 --------------------------");
		System.out.print("                "+scores[2]);		
		System.out.print("       |  "+scores[2][0]);		
		System.out.print("  |  "+scores[2][1]);		
		System.out.print("  |  "+scores[2][2]);		
		System.out.println("  |  "+scores[2][3]);
		System.out.println("                                 --------------------------");			
		

	}

}
