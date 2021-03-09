package day26_arrays_part3;

public class Task94_Password2 {

	public static void main(String[] args) {
		
		String info1 = "This info is used for creation password : xxxCD132Gxxx. Please do not share with anyone";		
		String info2 = "This info is used for creation password : xxx00ABC!xxx. Please do not share with anyone";
		
		String[] result = info1.concat(info2).split("xxx");
		String res = result[1].concat(result[3]);
		System.out.println(res);
	}

}
