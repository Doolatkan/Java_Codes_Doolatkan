package review_session.week5;

public class VotingCheck {

	public static void main(String[] args) {

		checkIfCanVote(30);
		checkIfCanVote(15);
		int age2 = 2020-1985;
		
		checkIfCanVote(age2);
		printAge(1990);

	}
	
	public static void checkIfCanVote(int age) {		
		
		if(age>=18) {
			System.out.println("You are eligible to vote");
		}else {
			System.out.println("You are not eligible to vote");
		}
	}
	
	
	public static void printAge(int birthday) {
		int age = 2020-birthday;
		System.out.println("Birthyear:" + birthday + " .age" + age);
	}

}
