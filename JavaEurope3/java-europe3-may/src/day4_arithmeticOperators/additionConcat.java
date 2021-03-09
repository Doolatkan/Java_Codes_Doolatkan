package day4_arithmeticOperators;

public class additionConcat {

	public static void main(String[] args) {

        //Number + Number = Addition
		System.out.println(2+2);
		System.out.println(20+200);
		
		//Number + String : Concatenation
		System.out.println(5 + "hell");
 
		//String + Boolean : Concatenation
		System.out.println("hello" + true);
		
		//String + String : Concatenation
		System.out.println("hello" + "world");
		
		//Boolean + Number 
		//System.out.println(true + 1);
		
		System.out.println(2+0+3+"Cybertek");// 5Cybertek
		System.out.println("Cybertek"+2+0+5);//Cybertek205
		System.out.println(2+0+5+"Cybertek" +2+0+5);
		System.out.println(2+0+5+"Cybertek"+(2+0+1)+"dud"+2+(25+26)+99+(10+15));
		
		float dev = 10/3f;
		System.out.println(dev);
		
		
		
	}

}
