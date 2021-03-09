package review_session.week8;

import java.util.Arrays;

public class SumArray {

	public static void main(String[] args) {
		
		
		double[] prices= {19.99,23.5,5.99,102.5};
		System.out.println(Arrays.toString(prices).toUpperCase());
		for(double val : prices) {
			
			if(val>100) {
				System.out.println("item is too expensive");
				continue;
				//break;
			}
			System.out.println(val);
		}
		
		System.out.println("------------------------------------");
		//sum of array
		
		double sum = 0.0;
		
		for(double val : prices) {
			sum += val;
		}
		System.out.println("Total Price is:" + sum);

	}

}
