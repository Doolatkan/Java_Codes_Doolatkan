package day33_ClassObjects_Constructers;

public class Month {
	
	int numTeeth;
	int numWhiskers;
	int weight;
	
	//1
	public Month(int weight) {//i want to call constractor2
		this(30,weight);
		this.weight = weight;
		System.out.println("JAVA");
	}

   //2
	public Month(int numTeeth, int weight) {//i want to call constractor3
		
		this(numTeeth,20,weight);
		this.numTeeth = numTeeth;
		this.weight = weight;
		System.out.println("JS");
		
	}

   //3
	public Month(int numTeeth, int numWhiskers, int weight) {
		
		this.numTeeth = numTeeth;
		this.numWhiskers = numWhiskers;
		this.weight = weight;
		System.out.println("TS");
	}
	
	public void print() {
		
		System.out.println(weight + " " + numTeeth + " " + numWhiskers);
		
	}
	
	
}
