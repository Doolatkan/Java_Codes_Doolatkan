package review_session.week7;

public class String_Length {

	public static void main(String[] args) {
		
		String name ="Mike Smith";
		System.out.println(name.length());
		
		int ln = name.length();
		
		String password = "cybertek123";
		
		if(password.length()>=8) {
			System.out.println("Password length matches with requirements");
		}else {
			System.out.println("Try it again");
		}

	}

}
