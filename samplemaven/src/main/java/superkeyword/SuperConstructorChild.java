package superkeyword;

public class SuperConstructorChild extends SuperConstructorParent{
	public SuperConstructorChild() {
		super(10,20);
		System.out.println("Child Class Constructor");
	}

	public static void main(String[] args) {
		SuperConstructorChild obj = new SuperConstructorChild();
		
	}

}
