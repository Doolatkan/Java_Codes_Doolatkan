package day27_arrays_part4;

import java.util.Arrays;

public class Pizza2DArray {

	public static void main(String[] args) {
		
		String[][] pizzas = {
				
				{"pinneapple","pepperoni"},
				{"anchovies","mushroom","olives"},
				{"4 cheese"},
				{"chicken","tomatoes","onions"},
				{"green peppers","zuccini","brocoli","shrimp"}
				
		};
		
		System.out.println(Arrays.toString(pizzas[0]));
		
		System.out.println("------------------------------------------");
		System.out.println("###FOR EACH LOOP###");	
		System.out.println();
		for(String[] val: pizzas ) {
			System.out.print(val.length+" - ");
			System.out.println(Arrays.toString(val));
		}
		
		System.out.println("------------------------------------------");
		System.out.println("###FOR ITERATOR LOOP###");
		System.out.println();
		for(int i=0; i<pizzas.length;i++) {
			System.out.print(pizzas[i].length + " - ");
			for (int j = 0; j < pizzas[i].length; j++) {
				System.out.print(pizzas[i][j]+", ");
			}
			System.out.println();
		}
		
		
		System.out.println("------------------------------------------");
		System.out.println("###FOR ITERATOR LOOP2###");
		System.out.println();
		for(int i=0; i<pizzas.length;i++) {
			System.out.println(pizzas[i].length + " - " + Arrays.toString(pizzas[i]));			
		}
		
		System.out.println("------------------------------------------");
		System.out.println("###Print each element in 3-row###");
		System.out.println();
		for(int i=3; i<pizzas.length-1; i++) {
			System.out.println(Arrays.toString(pizzas[i]));
		}
		
		
		System.out.println("------------------------------------------");
		System.out.println("###Print each element in 3-row###");
		System.out.println();
		for(String val : pizzas[3]) {
			System.out.println(val);
		}
	
		System.out.println("------------------------------------------");
		System.out.println("###Print each id-students###");
		System.out.println(); 
		
		int[][] students = {{4,5,6},{12,5,7},{23,56,12,55,3}};
		
		for(int[] group : students) {
			for(int id : group) {
				System.out.print(id+",");
			}
			System.out.println();
		}

	}

}
