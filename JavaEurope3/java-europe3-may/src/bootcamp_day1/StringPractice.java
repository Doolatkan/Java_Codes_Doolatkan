package bootcamp_day1;

public class StringPractice {

	public static void main(String[] args) {

     String str1 = "EU3"; //String pool
     String str2 = new String("EU3"); //heap
     
     
     str1.toLowerCase(); //"eu3";
     
     
     System.out.println(str1);
     
     
     StringBuilder sb1 =  new StringBuilder("EU3");
     sb1.append(" School");
     
     System.out.println(sb1);
     
     StringBuffer sb2 = new StringBuffer("EU3");
     sb2.append(" School");
     System.out.println(sb2);
     
     String s1 = "Cybertek";
     char ch1 = s1.charAt(s1.length()-1);
     System.out.println(ch1);
     


	}
	
	public synchronized static void method1() {
		
	}
	
	public static void method2() {
		
	}

}
