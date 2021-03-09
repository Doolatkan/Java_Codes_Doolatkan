package day40_access_modifier_final;

public class Kangaroo extends Marsupial{
	
	/*public  boolean isBiped() {
		return true;
	}*/
	
	
	public static boolean isBiped() {
		return true;
	}
	
	public void getKangarooDescription() {
		System.out.println("Kangaroo hops on the legs: " + isBiped());
	}

}
