package day37_Inheritance;

public class Company {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.name = "Doolatkan";
		emp1.jobTitle = "SDET";
		emp1.age = 28;
		emp1.gender = 'F';
		
		emp1.work();
		emp1.eat("Salad");
		System.out.println(emp1.toString());

	}

}
