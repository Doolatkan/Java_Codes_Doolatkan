package day13_methods_Part1;

public class Task64_starPatterns {

	public static void main(String[] args) {


		starPattern(1);
		starPattern(2);
		starPattern(3);
		starPattern(4);
		starPattern(5);
		starPattern(6);

	}

	public static void starPattern(int num) {
		
		for(int i=1; i<=num; i++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
	

}
