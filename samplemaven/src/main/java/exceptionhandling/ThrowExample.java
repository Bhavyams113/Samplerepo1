package exceptionhandling;

public class ThrowExample {

	public static void main(String[] args) {
		int age = 10;
		if (age>=18)
		{
			System.out.println("eligible");
		}
		else
		{
			throw new NumberFormatException("Age under 18");
		}

	}

}
