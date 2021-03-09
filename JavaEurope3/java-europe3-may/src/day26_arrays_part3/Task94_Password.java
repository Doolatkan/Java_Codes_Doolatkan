package day26_arrays_part3;

import java.util.Arrays;

public class Task94_Password {

	public static void main(String[] args) {
		
		String info1 = "This info is used for creation password : xxxCD132Gxxx. Please do not share with anyone";		
		String info2 = "This info is used for creation password : xxx00ABC!xxx. Please do not share with anyone";
		
		String [] newInfo1 = info1.split("This info is used for creation password : ");
		String [] newInfo2 = info2.split("This info is used for creation password : ");
		System.out.println(Arrays.deepToString(newInfo1));
		String str = newInfo1[1].concat(newInfo2[1]).split("xxx. Please do not share with anyone")[0];
		String str1 = newInfo2[1].concat(newInfo2[1]).split("xxx. Please do not share with anyone")[0];
		String result = str.concat(str1).replace("xxx", "");
		System.out.println(result);		

	}

}
