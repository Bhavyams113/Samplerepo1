package exceptionhandling;

public class CustomException {

	public static void main(String[] args) throws VotingException, AgeException {
		int age = 10;
		if (age>=18)
		{
			System.out.println("eligible");
		}
		else
		{
			throw new AgeException("Age under 18");
		}

	}

}
