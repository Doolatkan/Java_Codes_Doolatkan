package review_session.week3;

public class Switch {

	public static void main(String[] args) {


		int i = 1;
		switch(i) {
		case 1:
			System.out.println(i);
		case 2:
			i = ++i;
			System.out.println(i);
			break;
		case 3:
			i = ++i;
		System.out.println(i);
		}
	}

}
