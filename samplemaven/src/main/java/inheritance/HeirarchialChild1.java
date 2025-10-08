package inheritance;

public class HeirarchialChild1 extends HeirarchialParent {
public void display1() {
	System.out.println("Child Class");
}
	public static void main(String[] args) {
		HeirarchialChild1 obj = new HeirarchialChild1();
		obj.display();
		obj.display1();
		

	}

}
