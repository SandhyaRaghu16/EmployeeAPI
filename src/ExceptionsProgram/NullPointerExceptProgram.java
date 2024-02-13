package ExceptionsProgram;

public class NullPointerExceptProgram {
	public static void main(String[] args) {
		String word=null;
		int b=0;
		try{
			b=word.length();// will throw exception since it is null//
		}
		catch(NullPointerException n)
		{
			System.out.println("For null length cannot be found");
		}
		//System.out.println(b);
	}

}
