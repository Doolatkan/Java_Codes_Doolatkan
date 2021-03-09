package day42_abstract_interface;

public class Tesla2 extends Vehicle implements Electric,SelfDriving{

	@Override
	public void charge() {
		System.out.println("Charge");
		
	}

	@Override
	public void charge2() {
		System.out.println("Charge2");
		
	}

	@Override
	public void selfDrive() {
		System.out.println("selfDrive");
		
	}

	
	
	

}
