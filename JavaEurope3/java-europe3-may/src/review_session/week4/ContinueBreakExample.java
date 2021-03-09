package review_session.week4;

public class ContinueBreakExample {

	public static void main(String[] args) {


		for(int i=1; i<=10;i++) {
			if(i>=2&&i<=4) {
				System.out.println("Skipped-" + i);
				//continue;
				break;
			}
			System.out.println(i);
		}

	}

}
