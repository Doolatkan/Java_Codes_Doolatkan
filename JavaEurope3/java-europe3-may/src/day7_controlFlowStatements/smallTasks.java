package day7_controlFlowStatements;

public class smallTasks {

	public static void main(String[] args) {
		
		// 1-Write an if statement that assigns 5 to x when y is equal to 20
		
		int x, y;
		    x=10;
		    y=20;

           if(y==20) {
        	   
        	   x = 5;
        	   
           }
           System.out.println("x = " + x + "  y = " + y);
           
           
         // 2 - Write an if statement that multiplies by 1.5 if hours is greater than 40
          
           double payRate = 1000;
           int hours = 41;
           
           
           if(hours > 40) {
        	   payRate = payRate * 1.5;
           }
           
           System.out.println("Payrate is " + payRate);
           
         //3-hvfj
           
           int fee = 20;
           boolean max = ( 45/9 >= 5)^ (4 == 6*8);
           
            if (max) {
            	
            	fee = 50;
            }
          System.out.println("max = " + max + "  fee is = " + fee); 
          
          //4-lhfljf
          
          int a, b, c;
          a = 200;
          b = 50;
          c = 10;
          
          if(b==50 && c>=100){
        	  
        	  a = 20;
          }
          
          System.out.println("a = " + a + " b = " + b + " c = " + c);
          
          //5-ldkcdlj
          
          int temp = 72;
          
          if(temp>=70 && temp <= 80) {
        	  System.out.println("Ideal Temp");
          }
          
          
	}

}
