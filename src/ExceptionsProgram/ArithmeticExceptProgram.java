package ExceptionsProgram;

public class ArithmeticExceptProgram {
	public static void main(String[] args) {
		
		System.out.println("Start of the Program");
		
		int a=10;
	//	int b=5;
		int b=0;
		int c=2;
		
		try {
	//	System.out.println(a/b);//will execute the program while a=10;b=5//
		System.out.println(a/b);// will throw exception since it can't be executed//
		}
		catch(ArithmeticException d)
		{
			System.out.println("Cannot Divide by Zero");
		}
		finally
		{
			System.out.println(a+c);
			System.out.println(a*c);
			System.out.println(a-b);
			System.out.println(a%c);
		}
		System.out.println("End of the Program");
	}

}
