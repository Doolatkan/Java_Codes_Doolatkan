package day45_exceptionshandaling;

public class ThrowAndThrows {

	public static void main(String[] args){
		
		System.out.println("Hello World");
		
		//throw new RuntimeException("This is someexception");
		
		try {
		throw new Exception("Another exception");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		String username = "";
		
		if(username.isEmpty()) {
			throw new RuntimeException("User name can not be empty");
		}else {
			System.out.println("Valid user name");
		}

		try {
			sleep3(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void sleep(int second) throws InterruptedException {
		Thread.sleep(second * 1000);
	}
	
	public static void sleep2(int second) throws InterruptedException {
		sleep(second);
	}
	
	public static void sleep3(int second) throws InterruptedException {
		sleep2(second);
	}

}
