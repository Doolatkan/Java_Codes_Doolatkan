package day41_abstract_class;

public abstract class Dog extends Animal{
	
	public Dog() {
		super(15);
	}
	
	@Override
	void eat() {
		System.out.println("Dog food");
	}

	
	@Override
	void breathe() {
		// TODO Auto-generated method stub
		
	}

}
