package day13_methods_Part1;

public class GoogleSearch {

	public static void main(String[] args) {
		
		//for(int i=0; i<100; i++) {
		navigateGoogle();
		searchForShoes();
		printResults();
		//}

	}
	
	public static void navigateGoogle() {
		System.out.println("Launch chrome browser");
		System.out.println("navigate to google.com");
	}
	
	public static void searchForShoes() {
		System.out.println("type soes into search field");
		System.out.println("click on search button");
	}
	
	public static void printResults() {
		System.out.println("result for shoes ....");
	}

}
