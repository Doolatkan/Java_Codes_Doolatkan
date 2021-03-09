package day44_oopreview.callcenter;

public abstract class MessagingApp {
	
	public String name;
	protected boolean isFree;
	boolean allOSCompatible;
	private static int count;
	public static final String APP_TYPE = "Messenger";
		
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) { 
		MessagingApp.count = count;
	}

	public MessagingApp() {
		System.out.println("MessagingAPP no-args constractor...");
		
	}
	
	public MessagingApp(String name, int count) {
		this.name = name;
		MessagingApp.count = count;
	}

	public abstract void sendMessage(String msg);
	
	void launch() {
		System.out.println("MessagingApp is launching...");
	}
	
	public static void close() {
		System.out.println("MessagingApp is closing...");
	}
	

}
