package ExceptionsProgram;

public class MultiCatchProgram {
	public static void main(String[] args) {
		String[] var= {null,"priya","sandhya"};
		try
		{
			char a=var[0].charAt(0);
			String b=var[3];
			char c=var[1].charAt(10);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("error occured");
		}
		catch(NullPointerException ne)
		{
			ne.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println(ai);
		}
		catch(StringIndexOutOfBoundsException si)
		{
			System.out.println("Index out of bounds");
		}
		catch(IndexOutOfBoundsException ie)
		{
			ie.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("Error identified");
		}
		finally
		{
			System.out.println("code executed successfully");
		}
		}

}
