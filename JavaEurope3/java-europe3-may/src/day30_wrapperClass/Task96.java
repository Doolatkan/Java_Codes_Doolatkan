package day30_wrapperClass;

public class Task96 {

	public static void main(String[] args) {

		String str1 = "Today weather is sunny and 89 degree. It is a perfect day to practice java.";		
		String[] str2 = str1.split(" ");		
		double degree = Double.parseDouble(str2[5]);
		double celcius = (degree - 32)*5/9;		
		System.out.println(degree + " degree is equal to " + (Math.round(celcius*100.0)/100.0) + " celcius");
		
		String[] str3 = str1.split("and ");
		double degree1 = Double.parseDouble(str3[1].substring(0, str3[1].indexOf(" ")));
		double celc = (degree1 - 32)*5/9;
		System.out.println(degree1 + " degree is equal to " + (Math.round(celc*100.0)/100.0) + " celcius");
		
		String[] str4 = str1.split("and ");
		str4 = str4[1].split(" degree");
		double degree2 = Double.parseDouble(str4[0]);
		double celci = (degree2 - 32)*5/9;
		System.out.println(degree2 + " degree is equal to " + Math.round(celci*100.0)/100.0 + " celcius");

	}

}