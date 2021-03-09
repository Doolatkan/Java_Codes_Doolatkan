package day40_access_modifier_final;


public class FinalVariables {	
	
		
		public final int ROADSTER_MAX_RANGE = 500;		
		public final int MODEL_3_MAXSPEED;		
		public final int MODEL_X_PASSANGERS;
		public static final String ADMIN_USERNAME;
		
		
		public FinalVariables() {
			
			MODEL_3_MAXSPEED = 300;
			
			
		}
		
		{
			MODEL_X_PASSANGERS = 7;
		}
		
		static {
			ADMIN_USERNAME = "Doolatkan";
		}
		
		public static void main(String[] args) {
			
			int MAX_PASSENGER_COUNT=5;
			
			final int SSN;
			
			SSN = 66;
			
			FinalVariables fv = new FinalVariables();
			System.out.println(fv.ROADSTER_MAX_RANGE);
			System.out.println(fv.MODEL_3_MAXSPEED);
			System.out.println(fv.ADMIN_USERNAME);
			                        System.out.println(FinalVariables.ADMIN_USERNAME);
			System.out.println(ADMIN_USERNAME);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	

}
