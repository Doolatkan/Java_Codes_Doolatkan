package day38_Inheritance_part2;

public class FullTimeEmployee extends Employee{

	@Override
	void calculatePay(int hours, double rate) {
		double total = (hours*rate)*0.5;
		System.out.println("Total pay for employee = " + total);
	}

	
	
	
	
	

	
	
	
	

}
