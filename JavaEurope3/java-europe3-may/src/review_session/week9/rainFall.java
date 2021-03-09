package review_session.week9;

public class rainFall {
	

public double getSum(double[] rain) {
	
	double sum = 0; 
	for(double val : rain) {
		sum += val;
	}
	return sum;
}


public double getAverage(double[] rain) {
	
	return getSum(rain)/rain.length;
	
}


public double getMaxValue(double[] rain) {
	 double max = 0;
	 
	 for(double val : rain) {
		 if(max<val) {
			 max = val;
		 }
	 }
	 
	 return max;
}


public double getMinValue(double[] rain) {
	
	double min = Double.MAX_VALUE;
	for(double val : rain) {
		if(min>val) {
			min = val;
		}
	}
	
	return min;
}
}
