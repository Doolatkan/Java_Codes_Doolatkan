package day37_Inheritance;

public class FinalExam extends GreadActivity{
	
	private int numbQuestions;
	private double pointsEach;
	private int numMissed;
	
	public FinalExam(int numQuestions, int numMissed) {
		
		double numericScore;
		
		this.numbQuestions = numQuestions;
		this.numMissed = numMissed;
		
		pointsEach = 100.0/numQuestions;
		numericScore = 100.0-(numMissed*pointsEach);
		
		//My goal is to resive the letter based on my numericScore. How will I set my numericScore to score
		
		setScore(numericScore);
	}

}
