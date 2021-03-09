package assignments.Assignment_5ForLoop;

public class Question7 {

	public static void main(String[] args) {

		System.out.println("Numbers between 1 and 100 which are divisible by 5:");
		for(int i=1; i<=100;i++) {
			if(i%5==0) {
				System.out.print(i);
				if(i<100) {
					System.out.print(", ");
				}
			}
		}

	}

}
