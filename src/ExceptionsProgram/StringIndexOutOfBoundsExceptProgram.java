package ExceptionsProgram;

public class StringIndexOutOfBoundsExceptProgram {
	public static void main(String[] args) {
		
		String name="Sandhya@16397 ";
		String b="good";
		try
		{
		System.out.println(name.charAt(17));
		}
//		catch(StringIndexOutOfBoundsException se)
//		{
//			//se.printStackTrace();
//			//System.out.println(se);
//			System.out.println("Char not found for the given Index");
//		}
		finally
		{
			String c="very good";
			System.out.println(name.concat(c));
		}
	}

}
