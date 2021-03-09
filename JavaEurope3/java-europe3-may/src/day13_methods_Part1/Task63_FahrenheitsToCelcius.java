package day13_methods_Part1;

public class Task63_FahrenheitsToCelcius {

	public static void main(String[] args) {


		fahrenheitToCelcius(50);

	}

	public static void fahrenheitToCelcius(int fahrenheit) {


		int celcius = (fahrenheit-32)*5/9;
		System.out.println(fahrenheit + "F --> " + celcius + "C");
		
	}
	
	

}
