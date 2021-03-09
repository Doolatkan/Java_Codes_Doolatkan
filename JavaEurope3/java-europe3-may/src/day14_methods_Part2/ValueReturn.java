package day14_methods_Part2;

public class ValueReturn {

	public static void main(String[] args) {
		
		int x = sum(2,3);		
		System.out.println(sum(2,3));
    	System.out.println(x);
		System.out.println(x+sum(2,3));
		

	}
	
	public static int sum(int num1, int num2) {
		int result = num1+num2;
		System.out.println(result);
		
		return  result ;
	}

}
