package day30_wrapperClass;

import java.util.Arrays;

public class wrapperClass {

	public static void main(String[] args) {
		
		int n1 = 10;		
		Integer n2 = new Integer(10);
		System.out.println(n1);
		System.out.println(n2);
		
//		Integer[] m = new Integer[5];
//		System.out.println(Arrays.toString(m));
//		int[]m1=new int[5];
//		System.out.println(Arrays.toString(m1));
		
		
		double d1 = 44.5;
		Double d2 = new Double(44.5);
		double d3 = new Double("44.5");
		Double d4 = new Double(d1);
		Double d5 = d2;
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		double d6 = d1+d2+d3;
		System.out.println(d6);
		
		
		char ch1 = 'a';
		Character ch2 = new Character('a');
		System.out.println(ch1);
		System.out.println(ch2);
		
		
		byte b1 = 100;
		Byte b2 = new Byte((byte)100);
		Byte b3 = new Byte("100");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		Integer num1 = Integer.valueOf(1234);
		System.out.println(num1);
		
		Double dd1 = Double.valueOf(12);
		System.out.println(dd1);
		
		Byte bb1 = Byte.valueOf((byte)15);
		Byte bb2 = Byte.valueOf("15");
		System.out.println(bb1);
		System.out.println(bb2);
		
		Boolean bool1 = Boolean.valueOf(true);
		Boolean bool2 = Boolean.valueOf("true");
		System.out.println(bool1);
		System.out.println(bool2);
		
		Long l1 =Long.valueOf(1230546);
		System.out.println(l1);
		
		Float f1 = Float.valueOf(125896);
		System.out.println(f1);
		
		Integer i1 = 12;
		Integer i2 = Integer.valueOf(12);

	}

}
