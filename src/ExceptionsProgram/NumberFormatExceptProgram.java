package ExceptionsProgram;

public class NumberFormatExceptProgram {
	public static void main(String[] args) {
		
		String a="Sandhya10";
		
		try {
		float b=Float.parseFloat(a);
		System.out.println(b);
		}
		
		catch(NumberFormatException nf)
		{
			System.out.println("String cannot be converted to Float");
		}
	}

}
