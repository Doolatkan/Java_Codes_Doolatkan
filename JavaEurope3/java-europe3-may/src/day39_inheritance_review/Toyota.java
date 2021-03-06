package day39_inheritance_review;

public class Toyota extends Car{
	
	
	private int roadService;

	public Toyota(int roadService) {
		super("Toyota", 3, 4, 4, 4, false);
		this.roadService = roadService;
	}
	
	public void accelerate(int rate) {
		
		int newVelocity = getCurrentVelocity()+rate;
		
		if(newVelocity==0) {
			stop();
			change(1);
		}else if(newVelocity>0 && newVelocity<=10) {
			change(1);
		}else if(newVelocity>10 && newVelocity<=20) {
			change(2);
		}else if(newVelocity>20 && newVelocity<=30) {
			change(3);
		}else {
			change(4);
		}
		
		if(newVelocity>0) {
			changeVelocity(newVelocity, getCurrentDriection());
		}
		
	}	
	
	

}
