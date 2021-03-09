package day42_abstract_interface;

public interface Electric {
	
	public static final boolean HAS_BATTERIES = true;
	
	boolean HAS_BATTERIS2 = false; //public static final
	
	public abstract void charge();
	
	void charge2(); //public abstract
	
	//public void m() {} // error
	
	
	public default void methodA() {
		System.out.println("Default");
	}
	
	public  static void methodB() {
		System.out.println("Static");
	}
	
	//public final static void methodAB() { // error, Method cannot be final
	//	System.out.println("Static");
	//}

}
