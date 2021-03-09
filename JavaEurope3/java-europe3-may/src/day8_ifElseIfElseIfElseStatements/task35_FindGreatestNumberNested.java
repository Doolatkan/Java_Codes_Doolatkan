package day8_ifElseIfElseIfElseStatements;

public class task35_FindGreatestNumberNested {

	public static void main(String[] args) {


		int n1 = 10000;
		int n2 = 10000;
		int n3 = 1000;
		
		if(n1 == n2 || n1 == n3 || n2 == n3) {
			System.out.println("Numbers are still");
		}
	    else if(n1>n2 && n1>n3) {
			System.out.println("Greatest is n1= " + n1);
	    }else {
			   if(n2>n3) {
			     System.out.println("Greatest is n2= " + n2);
		       }else {
		         System.out.println("Greatest is n3 " + n3);
		       }
	     } 
		
	}

}


