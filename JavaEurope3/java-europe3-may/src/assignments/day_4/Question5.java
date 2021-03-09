package assignments.day_4;

public class Question5 {

	public static void main(String[] args) {
        
		int inputSeconds, hours, minutes, seconds;
		
		inputSeconds = 3965;
		hours = inputSeconds/3600;
		minutes = (inputSeconds%3600)/60;
		seconds = inputSeconds%60;
		
		System.out.println("Input second is = " + inputSeconds + "\nIt is " + hours + " hours, " + minutes + " minutes, " + " and " + seconds + " seconds");
		

	}

}
