package assignments.day_4;

public class Question6 {

	public static void main(String[] args) {

        int numMiliGrams  = 1000;
		final int overdoseMiligrame = 10000;
		int drinks = overdoseMiligrame / numMiliGrams;
		
		System.out.println("Number of miligrams in drink: " + numMiliGrams + "\nIt would take about " + drinks + " drinks for a lethal overdose");
		
		

	}

}
