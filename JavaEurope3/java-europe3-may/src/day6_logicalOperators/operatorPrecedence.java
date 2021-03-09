package day6_logicalOperators;

public class operatorPrecedence {

	public static void main(String[] args) {
		  
		int applesCount = 20;
		int orangeCount = 30;
		int pearsCount = 30;
		
		boolean comp = (applesCount<orangeCount)||(orangeCount>=pearsCount);
		
		System.out.println(comp);
		
		System.out.println("****************************");
		
		String OutsideWeather;
		int Degree;
		OutsideWeather = "Shinny";
		Degree = 70;
		
		boolean comp2 = (!(OutsideWeather == "Rainy" || Degree == 70));// (!(F||T))=!T=false
		
		System.out.println(comp2);
		
		System.out.println("*****************************");
		
		int b = 2;
		boolean res = ++b == 2 || --b == 2 && --b == 2;
		
		//b in memory: 2 => 3 = > 2 => 1
		//res        : 3 == 2 || 2 == 2 && 1 == 2; // F || T && F = F || F = F
		
		System.out.println(res);
		
		
		System.out.println("*****************************");
		
		boolean x = true, z = true;
		int y = 20;
		x = (y!=10)||(z=false);
		
		System.out.println(x); // T || --- = T // =  ===
		
		
        System.out.println("*****************************");
		
		boolean g = true, d = true;
		int i = 20;
		g = (i!=10)&&(d=false);
		
		System.out.println(g); // T&&F= F // =   ==
		
		
		System.out.println("*****************************");
		
		
		
		

	}

}
