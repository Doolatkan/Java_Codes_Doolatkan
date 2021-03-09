package day16_classObjects;

public class Contact {
	
	String name;
	int phoneNumber;
	String email;
	
	public void call() {
		System.out.println("Call " + name + "'s phone number " + phoneNumber + " or write email");
	}
	
	public void sendMessage() {
		System.out.println("Send message to " + name);
	}
	
	public void sendEmail() {
		System.out.println("Send email to " + name);
	}

}
