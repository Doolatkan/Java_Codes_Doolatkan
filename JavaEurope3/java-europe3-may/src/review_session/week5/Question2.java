package review_session.week5;

public class Question2 {

	public static void main(String[] args) {
		
		change(43);
		change(65);
		change(70);
		change(95);

	}

	public static void change(int price) {

      int dol=100;
      int quarters = (dol-price)/25;
      int dimes=((dol-price)%25)/10;
      int nickles =(((dol-price)%25)%10)/5;
      System.out.println("Price in cents: " + price);
      System.out.println("Your change is: " + quarters +" uarters, " + dimes+ " dimes," + nickles + " nickles");
		
	}

}
