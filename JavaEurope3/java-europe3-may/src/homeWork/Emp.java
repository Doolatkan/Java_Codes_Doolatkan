package homeWork;

public class Emp {
	
	String perID;
	
	public Emp(String id){
		System.out.println(perID = id);
	}
	
	public Emp(String id, String name){
		System.out.println(perID = id+name);
	}
	{
		System.out.println("Show ID");
	}
	
	public void printID() {
		System.out.println("This is id " + perID);
	}
	
	public void changeID() {
		perID = perID+100;
		System.out.println("This is new id " + perID);
	}

}
