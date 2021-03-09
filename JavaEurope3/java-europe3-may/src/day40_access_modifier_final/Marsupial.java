package day40_access_modifier_final;

public class Marsupial {
	
	/*
	public  boolean isBiped() {
		return false;
	}*/
	
	
	public static boolean isBiped() {
		return false;
	}
	
	public void getMarsupialdescription() {
		System.out.println("Marsupial walks on the two legs: " + isBiped());
	}

}
