package day16_classObjects;

public class CellPhone {
	
	String brand;
	double screenSize;
	String color;
	double price;
	
	public void call() {
		System.out.println("Brand[" + brand + "],screenSize[" + screenSize + "],color[" + color + "],price[" + price + "]");
	}
	
	public void message(int num){
		System.out.println("Message to phone number:" + num);
	}
	
	public void takeAphoto() {
		String photoName = "my phone";
		System.out.println("Price phone " + price + "$");
	}

}
