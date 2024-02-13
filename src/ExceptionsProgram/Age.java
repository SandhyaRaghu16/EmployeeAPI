package ExceptionsProgram;

public class Age {
	public static void main(String[] args) throws AgeException {
		int age=17;
		if(age>18)
		{
			System.out.println("Eligible to Vote");
		}
		else
		{
			throw new AgeException("Not Eligible to Vote");
		}
	}

}
