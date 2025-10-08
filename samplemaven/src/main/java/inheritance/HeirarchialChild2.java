package inheritance;

public class HeirarchialChild2 extends HeirarchialParent {
	public void dislay2() {
		System.out.println("Child Class2");
	}

	public static void main(String[] args) {
		HeirarchialChild2 obj = new HeirarchialChild2();
		obj.dislay2();
		obj.display();
				

	}

}
