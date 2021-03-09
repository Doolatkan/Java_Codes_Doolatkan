package review_session.week5;

public class Question3 {

	public static void main(String[] args) {


		BMI(155,5,4);

	}

	public static void BMI(double kg, double feet, double inches) {
		double mass = kg/2.2;
		double height = ((feet*12)+inches)*0.0254;

         double BMI = mass/(height*height);
         
         if(BMI<18.5) {
        	 System.out.println(BMI + " Underweight");
         }else if(BMI<25) {
        	 System.out.println(BMI + " Normal weight");
         }else if(BMI<30) {
        	 System.out.println(BMI + " Overweight");
         }else{
        	 System.out.println(BMI + " Obese");
         }
		
	}
	

}
