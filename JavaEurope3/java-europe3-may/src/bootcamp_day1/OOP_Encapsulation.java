package bootcamp_day1;

public class OOP_Encapsulation {
	
	private String name = "Cybertek";
	private double salary = 12345.0;
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	


}
class Test{
	public static void main(String[] args) {
	OOP_Encapsulation obj = new OOP_Encapsulation();
	//System.out.println(obj.name);
	obj.setName("CCC");
	obj.setSalary(1202.02);
	System.out.println(obj.getName());
	System.out.println(obj.getSalary());
	
	}
}
