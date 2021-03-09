package day16_classObjects;

public class EmployeeObjects {

	public static void main(String[] args) {


		Employee emp1 = new Employee();
		emp1.jobTitle = "Java programer";
		emp1.name = "Doolatkan";
		emp1.salary = 99000;
		emp1.work();
		emp1.attendMeeting();
		emp1.introduce();

	}

}
