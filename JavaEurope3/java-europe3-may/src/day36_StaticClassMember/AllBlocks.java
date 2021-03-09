package day36_StaticClassMember;

public class AllBlocks {
	
	
	
	public AllBlocks(int x) {
		System.out.println("One Argument Constructor");
	}
	 
	public AllBlocks() {
		System.out.println("No Argument Constructor");
	}
	
	static {
		System.out.println("First Static Init");
	}
	
	{
		System.out.println("First Instance Init");
		int x=5;
		System.out.println(x++);
	}
	
	{
		System.out.println("Second Instance Init");
	}
	
	static{
		System.out.println("Second Static Init");
	}
	
	
	

}
