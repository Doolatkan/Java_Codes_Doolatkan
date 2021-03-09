package day33_ClassObjects_Constructers;

public class Student {

	String name;
	int age;
	char gender;
	int year;
	int course;
	String university="Cybertek";//default value as Cybertek
	
	
	
	public Student(String name, int age, char gender, int year, int course) {
	
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;
	}
	public void attendLecture() {
		System.out.println(this.name + " is attending lecture");
		
	}
    public void submitAssignment() {
    	System.out.println(name + " is submitting assignment");
	}
    public void attendLab() {
    	System.out.println(name + " is attending lab");
    }
	
}
