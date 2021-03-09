package bootcamp_day1;

public class LoopsPractice {

	public static void main(String[] args) {
		
		String str = "Cybertek";
		
		String result = "";
		for(int i=str.length()-1; i>=0; i--) {
			result = result + str.charAt(i);
		}
		
		System.out.println(result);
		
		String result2 = "";
		int j = str.length()-1;
		while(j>=0) {
			result2 += str.charAt(j);
		j--;
		}
		
		System.out.println("================================================");
		
		String s1 = "aaabbbccc";
		String res = "";
		for(int i =0; i<= s1.length()-1; i++) {
			if(!res.contains(""+s1.charAt(i))){
				res += s1.charAt(i);
			}
		}
		System.out.println(res);
		

	}

}
