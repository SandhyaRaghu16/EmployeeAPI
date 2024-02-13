package ExceptionsProgram;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundExceptProgram {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\sandh\\Downloads\\Exception\\exceptions.txt");
		FileReader fr=new FileReader(f);
		int temp=0;
		while((temp=fr.read())!=-1)
		{
			System.out.print((char)(temp));
		}
	}

}
