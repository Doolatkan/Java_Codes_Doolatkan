package homeWork;

public class Floor {
	
     double width;
     double lenght;

     public Floor(double width, double length) {
    	 
    	 this.width = width;
    	 lenght = length;
    	 
     }
     
     public double getArea() {
    	 
    	 return width*lenght;
     }
}
