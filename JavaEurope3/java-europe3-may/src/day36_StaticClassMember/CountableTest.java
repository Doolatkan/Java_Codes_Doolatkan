package day36_StaticClassMember;

public class CountableTest {

	public static void main(String[] args) {
		
		
		int objectCount;
		Countible o1 = new Countible();
		Countible o2 = new Countible();
		Countible o3 = new Countible();
		/*
		objectCount = o1.getInstanceCount();
		objectCount = o2.getInstanceCount();
		objectCount = o3.getInstanceCount();
		*/
		
		
		System.out.println(o2.getInstanceCount());
		//System.out.println(Countible.instanceCount);
		
		
	}

}
