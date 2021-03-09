package day38_Inheritance_part2;

public class StaticTest {
	
	public static void main(String[] args) {
		
		StaticSubClass obj = new StaticSubClass();
		obj.num = 5;
		obj.print();
		
		StaticSuper.num=10;
		
		obj.print();
		
		System.out.println(StaticSubClass.num);
		
		//StaticSubClass.m2(); //error
		obj.m2(); 
		
		StaticSubClass.m1();	
		
		
	}

}
