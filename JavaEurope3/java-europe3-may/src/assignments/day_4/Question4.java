package assignments.day_4;

public class Question4 {

	public static void main(String[] args) {

        float Num1, Num2, Num3;
        Num1 = 125;
        Num2 = 200;
        //1way
        System.out.println("Num1 = " + Num2);
        System.out.println("Num2 = " + Num1);
        
        //2way
        Num3 = Num1;
        Num1 = Num2;
        Num2 = Num1;
        System.out.println("Num1 = " + Num1);
        System.out.println("Num2 = " + Num3);

	}

}
