package abc;

public class B extends A{
	
	public B() {
		
		
		System.out.println("in constructor of B");
	}
	
	public B(int i) {
		super.print();
		System.out.println("in parameterized constructor of B"+i);
	}

}
