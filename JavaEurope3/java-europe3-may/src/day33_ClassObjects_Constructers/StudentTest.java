package day33_ClassObjects_Constructers;

public class StudentTest {

	public static void main(String[] args) {
		
		Student st1 = new Student("Mike", 27, 'M', 2019, 3);
		Student st2 = new Student("Doolatkan", 27, 'F', 2020, 3);
		Student st3 = new Student("Peter", 37, 'M', 2010, 5);
		
		st1.attendLab();
		st2.attendLecture();
		st3.submitAssignment();
		System.out.println(st1.university);
		System.out.println(st2.university);
		System.out.println(st3.university);
		
		

	}

}
