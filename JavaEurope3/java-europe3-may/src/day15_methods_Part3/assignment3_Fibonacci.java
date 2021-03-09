package day15_methods_Part3;

public class assignment3_Fibonacci {

	public static void main(String[] args) {

		int n1 = 0;
    	int n2 = 1;
    	int series= 15;
    	
    	System.out.println("Fibonacci series of " + series  + " numbers");
    	
        for(int i = 1; i< series; i++) { 
        	
        	System.out.print(n1 + " ");
        	
        	int num = n1+n2;
        	n1 = n2;
        	n2 = num;        	
        	
        }	

	}

}
