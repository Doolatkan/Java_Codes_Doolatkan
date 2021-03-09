package day15_methods_Part3;

public class Repl {

	public static void main(String[] args) {
		   threeLocks(true, false, true);
		   
	  }
	  
	public static boolean threeLocks(boolean a, boolean b, boolean c) {
	    
	    if(a & b | c){
	      System.out.println(true);
	      return true;
	    }
	  System.out.println(false);
	   return false; 
	  }
	

	}


