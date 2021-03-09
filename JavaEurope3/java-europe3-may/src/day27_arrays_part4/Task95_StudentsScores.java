package day27_arrays_part4;

import java.util.Arrays;

public class Task95_StudentsScores {

	public static void main(String[] args) {
		
		int[][] scores = {{68,75,54,80},{100,64,20,50},{10,35,40,90}};
		
		int avg = 0;
		int totalMath = 0;
		
		for(int i=0 ;i<scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				if(i==0) {
					avg = avg + scores[i][j];	
				}
				if(j==0) {
					totalMath = totalMath + scores[i][j]; 
				}				
			}
		}
		
		avg = avg/scores[0].length; 
		System.out.println(avg);
		System.out.println(totalMath);
		
//		for(int s: scores[0]) {
//			avg = avg + s;				
//		}	
//		avg = avg/scores[0].length;
//		System.out.println(avg);
//	}
	}
}
