package assignments.Assignment_5ForLoop;

public class Question3 {

	public static void main(String[] args) {

		int sum=0;
		System.out.println("Even numbers between 5 and 50:");
		    for(int i=5;i<=50;i++) {
        	if(i%2==0) {
        		sum=sum+i;
        		System.out.print(i+",");
        	}        	
        }
        System.out.println("\nTotal of even numbers: " + sum);

	}

}
