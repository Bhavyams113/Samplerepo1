package interfaceexample;

public class Interface2 implements Interface1 {
	public void display() {
		System.out.println("Child Class");
	}
	

	public static void main(String[] args) {
		Interface2 obj = new Interface2();
		obj.display();
		obj.print();
		obj.sum();
	}


	@Override
	public void print() {
		System.out.println("Interface");
		// TODO Auto-generated method stub
		
	}


	@Override
	public void sum() {
		int a= 10;
		int b = 60;
		int c= a+b;
		System.out.println(c);
		// TODO Auto-generated method stub
		
	}

}
