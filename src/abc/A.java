package abc;

public class A extends Object {

	public int id = 1;
	public String name;

	public A() {

		super();
		// System.out.println("in constructor of A");// TODO Auto-generated constructor
		// stub
	}

//	public A(int i) {
//		
//		super();
//		System.out.println("in parameterized constructor of A");
//	}
//	

	void print() {
		System.out.println("print method");

	}

	public A(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
