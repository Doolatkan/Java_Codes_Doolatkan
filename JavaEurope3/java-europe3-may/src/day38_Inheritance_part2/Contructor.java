package day38_Inheritance_part2;

public class Contructor extends Employee{

	@Override
	void calculatePay(int hours, double rate) {
		double total =( hours*rate)+200;
		System.out.println("Contractor Total Pay: " + total);
	}
	
	

}
