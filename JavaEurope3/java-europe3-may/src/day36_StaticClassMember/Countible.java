package day36_StaticClassMember;

public class Countible {
	
	static int instanceCount;
	
	public Countible() {
		instanceCount++;
	}
	
	public int getInstanceCount() {
		return instanceCount;
	}

}
