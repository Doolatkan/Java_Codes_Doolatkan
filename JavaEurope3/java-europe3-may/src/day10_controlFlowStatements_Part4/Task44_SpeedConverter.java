package day10_controlFlowStatements_Part4;

public class Task44_SpeedConverter {

	public static void main(String[] args) {


		System.out.println("KPH\t|\tMPH");
		System.out.println("----------------------");
		final int Start_KPH = 60;
		final int max_KPH = 130;
		final int increment = 10;
		
		double MPH = 0;
		
		for(int KPH=Start_KPH;KPH<=max_KPH;KPH+=increment) {
			MPH=KPH*0.6214;
			double roundMPH =Math. round(MPH*10)/10.0;
		System.out.println(KPH + "\t|\t" + roundMPH);
		}

	}

}
