package day40_access_modifier_final;

public class TestParentChild {

	public static void main(String[] args) {
		
		Child s = new Child();
		
		System.out.println("Value of x before increment " + s.x);
		
		s.increment();
		System.out.println("Value of x after increment " + s.x);
		
			
		s.decriment();
		System.out.println("Value of x after decriment " + s.x);
		
		Parent p = new Parent();
		System.out.println("Value of x before increment " + p.x);
		
		p.increment();
		System.out.println("Value of x after increment " + p.x);
		
		//p.decriment();
		//System.out.println("Value of x after decriment " + p.x); //will not work 
		

	}

}

