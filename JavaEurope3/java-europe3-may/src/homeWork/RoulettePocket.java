package homeWork;

public class RoulettePocket {
	
	private int pocketNumber;
	private String color;
	
	
	public RoulettePocket(int pocketNumber) {
		
		if(pocketNumber==0) {
			color = "green";
		}else if(pocketNumber>=1 && pocketNumber<=10) {
			if(pocketNumber%2==0) {
				color = "black";
			}else {
				color = "red";
			}
		}else if(pocketNumber>=11 && pocketNumber<=18) {
			if(pocketNumber%2==0) {
				color = "red";
			}else {
				color = "black";
			}
		}else if(pocketNumber>=19 && pocketNumber<=28) {
			if(pocketNumber%2==0) {
				color = "black";
			}else {
				color = "red";
			}
		}else if(pocketNumber>=29 && pocketNumber<=36) {
			if(pocketNumber%2==0) {
				color = "red";
			}else {
				color = "black";
			}
		}
	}
	
	public String getPocketColor() {
		return color;
	}
	

}
