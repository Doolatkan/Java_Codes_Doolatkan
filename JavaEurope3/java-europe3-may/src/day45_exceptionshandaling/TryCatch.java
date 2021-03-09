package day45_exceptionshandaling;

public class TryCatch {

	public static void main(String[] args) {
		
		try {
			String str = "Java";
			System.out.println(str.charAt(0));
			System.out.println(str.charAt(4));
			System.out.println(str.charAt(2));
			System.out.println(str.charAt(3));
			//System.out.println(str.charAt(4)); //problem
			
			
		}catch (Exception e) {
			
			System.out.println("Exception happend - let you know!");
			
		}
		
		System.out.println("After try catch block!");

	}

}
