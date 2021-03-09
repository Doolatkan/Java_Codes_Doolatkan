package day10_controlFlowStatements_Part4;

public class Task43_printTable {

	public static void main(String[] args) {

		System.out.println("Number  | NumberSquared");
		System.out.println("-------------------------");
		
		for(int i=1; i<=10; i++) {			
			System.out.println(i + "\t"+ "|  " +(i*i));
		}

	}

}
