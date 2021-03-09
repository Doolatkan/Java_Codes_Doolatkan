package bootcamp_day2.ShapesTask;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionsPractice {

	public static void main(String[] args) {
		
		int[]arr = {1,2,3};
		//System.out.println(arr[258]); //uncheck exception
		
		//new FileInputStream(""); //check exception
		
		// System.out.println(9 / 0); //uncheck exception
		
		// Thread.sleep(1000); //checked
		
		/*
		 * Browser = cybertek
		 * Driver:
		 * throw new RuntimeException("Invalid Browser Name")
		 */
		
		//throw new RunttimeException("Invalid Browser Name");
		
		try {
			System.out.println(9/0);
		}catch(ArithmeticException e) {
			//System.exit(0); //stops the execution of finally block
		}finally {
			System.out.println("Finally Block");
		}
		
		System.out.println("Handled");

	}
	
	public void test1() throws IOException{
		throw new IOException();
	}
	
	public void test2() {
		try {
			
		test1();
		}catch(IOException e) {
			
		}
	}
	
	public void test3() {
		test2();
	}

		
}
