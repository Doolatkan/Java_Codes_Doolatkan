package day38_Inheritance_part2;

public class SubClass extends SuperClass{
	
	public SubClass() {
		
		super(11);
		//go to parent class find the constructor wich has no parameter
		System.out.println("This is the subclass constructor");
	}

}
