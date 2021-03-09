package day16_classObjects;

public class Employee {
	
	String name;
	String jobTitle;
	double salary;
	
	
	public void work() {
		System.out.println(name + " working like " + jobTitle + " and has salary " + salary);
	}
	
	public void attendMeeting() {
		System.out.println("Attend meeting " + name);
	}
	
	public void introduce() {
	    System.out.println("Introduce Mercedec");	
	}
	
}
