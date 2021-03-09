package day21_stringManipulation_part3;

public class String_Trim_Task {

	public static void main(String[] args) {

        String str = " 342 ";
        System.out.println(str);
        
        String result = str.replace(" ", "|");
        System.out.println(result);
        
        String result2 = "|" + str.trim() + "|";
        System.out.println(result2);
        
        String result3 = "|" + str.substring(1,4) + "|";
        System.out.println(result3);
		

	}

}
