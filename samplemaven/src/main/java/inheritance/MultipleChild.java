package inheritance;

public class MultipleChild implements Parent1,Parent2{
	public void sum() {
		int a =10;
		int b= 30;
		int c = a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		MultipleChild obj = new MultipleChild();
		obj.dispaly();
		obj.print();
		obj.sum();

	}

	@Override
	public void dispaly() {
		System.out.println("Child");
	}

	@Override
	public void print() {
		System.out.println("Parent");
		
	}

}
