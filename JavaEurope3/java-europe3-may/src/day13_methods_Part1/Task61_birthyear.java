package day13_methods_Part1;

public class Task61_birthyear {

	public static void main(String[] args) {


		birthYear(2010,1992);
		birthYear(2020,1992);

	}
	
	public static void birthYear(int currentYear, int birthYear) {
		int age = currentYear-birthYear;
		System.out.println("Your age is " + age);
	}

}
