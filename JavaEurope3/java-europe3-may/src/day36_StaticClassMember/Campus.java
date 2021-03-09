package day36_StaticClassMember;

public class Campus {
	
	private String city;
	
	static String country;
	
	static {
		System.out.println("Static Block-1");
	}
	
	public Campus(String city) {
		System.out.println("Constructor");
		this.city = city;
	}
	
	static {
		System.out.println("Static Block-2");
		country = "UK";
	}

}
