import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StringReadjava {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fos=new FileInputStream("../.newfile.txt");
		BufferedInputStream fout=new BufferedInputStream(fos);
		int x=fout.read();
		while(x!=-1)
		{
			System.out.print((char)x);
			x++;
		}
	}
}
