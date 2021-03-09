package homeWork;

public class Sub extends Super {
	
	String city;
	String code;
	int width;
	
	
	public Sub( ) {
		
		super( 12, 654);
		
		this.city = city;
		this.code = code;
		this.width = width;
	}


	
	public void print() {
		System.out.println("Sub [city=" + city + ", code=" + code + ", width=" + width + ", name=" + name + ", age=" + age + ", id="
				+ id + "]");
	}
	
	
	
	

}
