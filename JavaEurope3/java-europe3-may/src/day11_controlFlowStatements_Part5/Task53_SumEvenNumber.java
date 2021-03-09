package day11_controlFlowStatements_Part5;

public class Task53_SumEvenNumber {

	public static void main(String[] args) {


		int num = 0;
		int sum = 0;
		while(num<100){
			if(num%2==0) {
			sum=sum+num;			
			}
			
			num++;
		}
		System.out.println("sum = " + sum);
	}

}
