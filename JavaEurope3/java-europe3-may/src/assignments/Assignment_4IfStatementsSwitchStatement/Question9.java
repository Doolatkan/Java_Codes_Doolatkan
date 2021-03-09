package assignments.Assignment_4IfStatementsSwitchStatement;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Weight of Package:");
		double poundsPack = scan.nextDouble();
		
		System.out.println("Enter Miles (min miles are 500):");
		
		int miles = scan.nextInt();
		double per = 0;			
			
		if(poundsPack>0 && poundsPack<=2) {
			if(miles%500 == 0) {
				per = (miles/500)*1.10;
			} else {
				per = (miles/500+1)*1.10;
			}
		}
		if(poundsPack>2 && poundsPack<=6)
			{if(miles%500 == 0) {
				per = (miles/500)*2.20;
			} else {
				per = (miles/500+1)*2.20;
			}
		}
		if(poundsPack>6 && poundsPack<=10) {			
			if(miles%500 == 0) {
				per = (miles/500)*3.70;
			} else {
				per =(miles/500+1)*3.70;
			}
		}
		if(poundsPack>10){
			if(miles%500 == 0) {		
				per = (miles/500)*3.80;
			} else {
				per = (miles/500+1)*3.80;
			}	
	    }
        System.out.println(per);
        
   }
	
}
	

	
