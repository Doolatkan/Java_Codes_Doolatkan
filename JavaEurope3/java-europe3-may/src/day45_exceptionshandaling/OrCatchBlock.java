package day45_exceptionshandaling;

public class OrCatchBlock {

	static String str;
	
	public static void main(String[] args) {
		
		
		
		try {
			System.out.println(str.toUpperCase());
		}catch (IllegalArgumentException | NullPointerException e) {
			//exception types cannot be sub - parent types
			e.printStackTrace();
		}

	}

}
