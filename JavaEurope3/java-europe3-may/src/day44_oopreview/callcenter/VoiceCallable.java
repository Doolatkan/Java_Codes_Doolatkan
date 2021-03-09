package day44_oopreview.callcenter;

public interface VoiceCallable {
	
	boolean CAN_CALL = true; //public static final boolean CAN_CALL = true;
	
	void call(String contact);// public abstract void call(String contact);
	
	public static void decline() {
		System.out.println("Mike declined voice call...");
	}
	
	public default void accept() {
		System.out.println("Mike finaly accepted voice call...");
	}

}
