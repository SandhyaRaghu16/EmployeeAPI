package ExceptionsProgram;

public class ArrayIndexOutOfBoundsExceptProgram {
	public static void main(String[] args) {
		int[] nums= {32,54,13,643,231,13};
		try
		{
		System.out.println(nums[10]);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Index not Found");
		}
	}

}
