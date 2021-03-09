package day15_methods_Part3;

public class MetjodOverLoading {

	public static void main(String[] args) {
		
		int sum = sum(5, 7);
		
		
		System.out.println(sum);
		System.out.println((sum(4, 5, 6)) - sum);
		System.out.println(sum(2, 3, 4, 5));
		System.out.println(sum(5, "Hello"));

	}
	
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	public static int sum(int a, int b, int c, int d) {
		return a*b*c*d;
	}
	
	public static int sum(int a, String b) {
		return a;
	}
	
	public static void sum() {        // no parameters method
		System.out.println("Hello");
	}
	
	//public static float sum(int a, int b) { // it is error
		
	//}

}




/*


1- Number of parameters
	add(int,int)
	add(int,int,int)
2-Data Type of Parameters
	add(int,int)
	add(int,float)
	
3- Sequence of data type parameters
	add(int,float)
	add(float,int)
	
4- Invalid Case - not overloading
	int add(int,int)
	float add(int,int)
	
*/
	

