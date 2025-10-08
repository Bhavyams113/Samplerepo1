package polymorphism;

public class PolyChild extends PolyParent{
	public void print(int a,int b) {
		int c = a-b;
		super.print(1000, 275);
		System.out.println(c);
		
		
	}

	public static void main(String[] args) {
		PolyChild obj = new PolyChild();
		obj.print(1000, 275);

	}

}
