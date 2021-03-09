package day4_arithmeticOperators;

public class integerToByte {

	public static void main(String[] args) {
		
		int x = 130;
		//byte b = x;
		byte b = (byte) x;
		System.out.println(b);//-126
		System.out.println(16+8+4+2);

		
		int pies = 10, people = 4;
		double piecesPerson;
		piecesPerson=pies/people;//int/int
		System.out.println(piecesPerson);
		
		
		
		/*int pies = 10, people = 4;
		double piecesPerson;
		piecesPerson=(double)pies/people;//double/int
		System.out.println(piecesPerson);
		
		int pies = 10, people = 4;
		double piecesPerson;
		piecesPerson=pies/(double)people;//int/double
		System.out.println(piecesPerson);
		
		
		int pies = 10, people = 4;
		double piecesPerson;
		piecesPerson=double(pies/people);//int/int
		System.out.println(piecesPerson);*/
		
	}

}
