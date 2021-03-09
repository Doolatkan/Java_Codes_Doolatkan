package day30_wrapperClass;

public class varArgs {

	public static void main(String[] args) {
		
		sum(2,4);
		sum(2,3,5,6);
		sum(10,5,50);
		
		System.out.println(concat("apple", "orange", "123", "result"));
		System.out.println(concat("1111", "2222", "3333", "4444"));

	}
	
	public static void sum(int...numbers) { //A varArg parameter can take a variable number of arguments

		int sum = 0;
         for(int val : numbers) {
        	 sum = sum+val;
         }
         
         System.out.println(sum);
	}
	
	public static String concat(String... str) {  //A varArg parameter can take a variable number of arguments
		
		String newStr = "";
		for(String val : str) {
			newStr = newStr + val.charAt(2);
		}
		
		return newStr;
	}

}
